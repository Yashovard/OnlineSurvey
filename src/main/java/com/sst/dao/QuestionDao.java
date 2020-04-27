package com.sst.dao;

import com.sst.model.Question;

public interface QuestionDao {
	public boolean insert(Question question);

	public boolean update(Question question);

}