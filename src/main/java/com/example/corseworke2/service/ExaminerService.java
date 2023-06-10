package com.example.corseworke2.service;

import com.example.corseworke2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
