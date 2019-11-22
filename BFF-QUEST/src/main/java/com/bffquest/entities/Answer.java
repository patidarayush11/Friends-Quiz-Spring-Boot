package com.bffquest.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Answer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ans_id;
	private String ans_text;
	private int ques_id;

	@ManyToOne
	@JoinColumn
	private Person person;

	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAns_text() {
		return ans_text;
	}

	public void setAns_text(String ans_text) {
		this.ans_text = ans_text;
	}

	public int getQues_id() {
		return ques_id;
	}

	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", ans_text=" + ans_text + ", ques_id=" + ques_id + ", person=" + person
				+ "]";
	}
	
	
	
}
