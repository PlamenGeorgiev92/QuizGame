package com.lancer.Question.Game.services;

import com.lancer.Question.Game.models.Question;
import com.lancer.Question.Game.repositories.QuestionRepository;
import com.lancer.Question.Game.repositories.QuizRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final QuestionRepository questionRepo;


    public QuestionService(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    public Question createQuestion (Question question){
        return this.questionRepo.save(question);
    }
}
