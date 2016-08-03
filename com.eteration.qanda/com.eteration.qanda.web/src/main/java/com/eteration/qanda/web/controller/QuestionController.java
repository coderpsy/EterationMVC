package com.eteration.qanda.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.qanda.models.Question;
import com.eteration.qanda.services.QuestionRepository;


@RestController
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepository;
	
	@RequestMapping(value = "/questions", method= RequestMethod.GET)
	public List<Question> getQuestion() {
		return (List<Question>) questionRepository.findAll();
	}
	
	@RequestMapping(value = "/search", method= RequestMethod.GET)
	public List<Question> search(String content){
		return (List<Question>) questionRepository.findByContent(content);
	}

}
