package com.example.corseworke2.service;

import java.util.Collection;
import java.util.Collections;

import com.example.corseworke2.exeption.DoesNotContainText;
import com.example.corseworke2.exeption.QuestionAlreadyExistsException;
import com.example.corseworke2.exeption.QuestionNotFoundException;
import com.example.corseworke2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions;
    private final Random random = new Random();

    public JavaQuestionService() {
        this.questions = new HashSet<>();
    }

    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        if (!questions.add(question)) {
            throw new QuestionAlreadyExistsException();
        }
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question quest = new Question(question, answer);
        questions.remove(quest);
        return quest;
    }

    public Question remove(Question question) {
        if (!questions.remove(question)) {
            throw new QuestionNotFoundException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        //Collection<Question> questions1 = new ArrayList<>(questions);
        //return questions1;
        return Collections.unmodifiableCollection(questions);
    }

    @Override
    public Question getRandomQuestion() {
        /*checkIfTextContains();
        List<Question> list = new ArrayList<>(questions);
        int randomN = random.nextInt(getAll().size());
        return list.get(randomN);
    }*/

        if (questions.isEmpty()) {
            throw new DoesNotContainText();
        }
        return new ArrayList<>(questions).get(random.nextInt(questions.size()));
    }

    private void checkIfTextContains() {
        //проверяет, содержит ли текст
        if (questions.isEmpty()) {
            throw new DoesNotContainText();
        }
    }
}
