package com.example.corseworke2.controller;

import com.example.corseworke2.model.Question;
import com.example.corseworke2.service.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/exam/java")
public class JavaQuestionController {
    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    @GetMapping(path = "/add")
    public Question addQuestion(@RequestParam("question") String question,@RequestParam("answer") String answer){
        return null;
    }
    @GetMapping(path = "/remove")
    public Question removeQuestion (@RequestParam("question") String question,@RequestParam("answer") String answer){
        return null;
    }
    public Collection<Question> getQuestion(){
        return null;
    }
}
