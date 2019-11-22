package com.bffquest.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int ques_id;
	private String ques_text;
	private String opt_1;
	private String opt_2;
	private String opt_3;
	private String opt_4;
	
	
	public int getQues_id() {
		return ques_id;
	}

	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}

	public String getQues_text() {
		return ques_text;
	}

	public void setQues_text(String ques_text) {
		this.ques_text = ques_text;
	}

	public String getOpt_1() {
		return opt_1;
	}

	public void setOpt_1(String opt_1) {
		this.opt_1 = opt_1;
	}

	public String getOpt_2() {
		return opt_2;
	}

	public void setOpt_2(String opt_2) {
		this.opt_2 = opt_2;
	}

	public String getOpt_3() {
		return opt_3;
	}

	public void setOpt_3(String opt_3) {
		this.opt_3 = opt_3;
	}

	public String getOpt_4() {
		return opt_4;
	}

	public void setOpt_4(String opt_4) {
		this.opt_4 = opt_4;
	}
		
}
