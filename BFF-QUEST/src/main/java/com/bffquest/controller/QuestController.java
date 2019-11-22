package com.bffquest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bffquest.entities.Answer;
import com.bffquest.entities.Dummy;
import com.bffquest.entities.Person;
import com.bffquest.entities.Question;
import com.bffquest.service.QuestService;



@Controller
public class QuestController {

	@Autowired
	private QuestService questService;
	@Autowired
	private Person person;
	
	@Autowired
	private Answer ans;
	
	@Autowired
	private Question question;

	@GetMapping("/")
	public String getForm() {
		return "register";
	}

	@PostMapping("/saveDetails")
	public String saveDetails(@RequestParam("name") String personName, @RequestParam("uname") String username,
			@RequestParam("passwd") String password, Map<String, Object> model) {
		person.setName(personName);
		person.setUname(username);
		person.setPasswd(password);
		questService.addPerson(person);
		Person tmpPerson  = questService.findPersonByUsername(username);
		model.put("person", tmpPerson);
		return "success";
	}

	@PostMapping("/questions")
	public ModelAndView getQuestions( @RequestParam("personId") int personId){
		ModelAndView model = new ModelAndView();
		
		List<Question> questionList= new ArrayList<>();
		questionList=questService.getQuestions();
		
		for(Question q : questionList){
			System.out.println(q.getQues_text());
			System.out.println(q.getOpt_1());
		}
		
		Map<String,Object> allObjectsMap = new HashMap<String,Object>();
	    allObjectsMap.put("allQuestions", questionList);
	    allObjectsMap.put("personId", personId);
	    //adding a set of objects for the model map
	    model.addAllObjects(allObjectsMap);

	    model.setViewName("question");
	    return model;
	    
	}
	
	
	@PostMapping("/saveAns")
	public String saveAns(@RequestParam("1")String colour,@RequestParam("2")String place,@RequestParam("personId") String personId){
		
		ans.setQues_id(1);
		ans.setAns_id(1);
		ans.setAns_text(colour);
		ans.setPerson(questService.findPersonById(Integer.parseInt(personId)));
		System.out.println(personId);
		questService.saveAnswers(ans);
		
		ans.setQues_id(2);
		ans.setAns_id(2);
		ans.setAns_text(place);
		ans.setPerson(questService.findPersonById(Integer.parseInt(personId)));
		System.out.println(personId);
		questService.saveAnswers(ans);
		
		ModelMap model=new ModelMap();
		model.put("personId", questService.findPersonById(Integer.parseInt(personId)));
		
		return "share";
		
	}
	
	
	
	
	/*
	 * @PostMapping("/saveDummy") public String saveDummy(@RequestParam("name")
	 * String personName,
	 * 
	 * @RequestParam("uname") String username) {
	 * 
	 * 
	 * dummy.setName(personName); dummy.setLastname(username);
	 * questService.addDummy(dummy);
	 * 
	 * 
	 * modelMap.put("employeeName", employeeName); modelMap.put("employeeEmail",
	 * employeeEmail);
	 * 
	 * return "success"; }
	 */
	
	

	
}
