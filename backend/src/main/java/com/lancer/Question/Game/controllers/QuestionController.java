package com.lancer.Question.Game.controllers;

import com.lancer.Question.Game.models.Question;
import com.lancer.Question.Game.services.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/question")
public class QuestionController {

    private final QuestionService questionService;


    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/create")
    public Question createQuestion (@RequestBody Question question){
        return questionService.createQuestion(question);
    }

}
