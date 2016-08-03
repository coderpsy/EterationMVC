package com.eteration.qanda.services;

import org.springframework.data.repository.CrudRepository;

import com.eteration.qanda.models.Question;
import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
	public List<Question> findByContent(String content);
}
