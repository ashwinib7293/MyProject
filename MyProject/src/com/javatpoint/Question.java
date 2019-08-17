package com.javatpoint;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {

	private int id;
	private String question;

	private Set<Integer> answer;

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String question, Set<Integer> answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer =  answer;
	}

	public void display() {
		System.out.println(id + " " + question);
		System.out.println("answer is");
		Iterator itr = answer.iterator();
		while (itr.hasNext()) {
       
		System.out.println(itr.next());
		}
	}

}
