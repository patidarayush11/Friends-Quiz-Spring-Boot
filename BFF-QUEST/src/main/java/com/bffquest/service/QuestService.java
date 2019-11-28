package com.bffquest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bffquest.entities.Answer;
import com.bffquest.entities.Dummy;
import com.bffquest.entities.Friend;
import com.bffquest.entities.Person;
import com.bffquest.entities.Question;
import com.bffquest.repository.AnswerRepository;
import com.bffquest.repository.DummyRepo;
import com.bffquest.repository.FriendRepository;
import com.bffquest.repository.PersonRepository;
import com.bffquest.repository.QuestionRepository;

@Service
public class QuestService {
	
	@Autowired
	private PersonRepository personRepository;	
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private DummyRepo dummyRepo;
	
	@Autowired
	private Answer ans;
	
	@Autowired
	Person person;
	
	@Autowired
	FriendRepository friendRepository;
	
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
	public Person findPersonByUsername(String username) {
		Person person=personRepository.findPersonByUsername(username);
	
		return person;
	}
	
	public Person findPersonById(int id) {
		person=personRepository.findByPersonId(id);
		return person;
	}
	public List<Question> getQuestions(){
		List<Question> questions= questionRepository.findAll();
		return questions;
		
	}
	
	public void saveAnswers(Answer ans) {
		answerRepository.save(ans);
		
	}
	
	
	public void addDummy(Dummy dummy) {
		dummyRepo.save(dummy);
	}

	public int evalScore(List<String> friendAnsList, int personId) {
		List<Answer> tmpAnsList=answerRepository.findByPersonAnsbyId(personId);
		List<String> ansTxt=new ArrayList<>();
		int score = 0;
		
		  
		  for(Answer a: tmpAnsList) { 
			  ansTxt.add(a.getAns_text());
		  }
		
		
		for(int i=0;i<ansTxt.size();i++) {
			if(ansTxt.get(i).equals(friendAnsList.get(i))) {
				score++;
			}
			else
				continue;
		}
		return score;
}

	public void addFriendScore(Friend friend) {
		friendRepository.save(friend);
	}

	public List<Friend> getScoreBoard(int personId) {
		List<Friend> friendScores =friendRepository.getFriendScoresByPersonId(personId);
		return friendScores;
	}

}
