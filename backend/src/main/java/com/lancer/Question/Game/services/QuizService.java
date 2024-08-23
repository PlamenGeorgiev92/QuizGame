package com.lancer.Question.Game.services;

import com.lancer.Question.Game.models.Question;
import com.lancer.Question.Game.models.Quiz;
import com.lancer.Question.Game.repositories.QuestionRepository;
import com.lancer.Question.Game.repositories.QuizRepository;
import org.springframework.stereotype.Service;

@Service
public class QuizService {


    private final QuizRepository quizRepo;

    public QuizService(QuizRepository quizRepo) {
        this.quizRepo = quizRepo;
    }


    public Quiz createQuiz (Quiz quiz){
        return quizRepo.save(quiz);
    }

    public Quiz addQuestionToQuiz (Integer quizId, Question question){
        Quiz quiz = quizRepo.getReferenceById(quizId);
        quiz.addQuestion(question);
        return quizRepo.save(quiz);
    }
}
