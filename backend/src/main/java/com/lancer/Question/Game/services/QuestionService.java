package com.lancer.Question.Game.services;

import com.lancer.Question.Game.models.Answer;
import com.lancer.Question.Game.models.Question;
import com.lancer.Question.Game.repositories.AnswerRepository;
import com.lancer.Question.Game.repositories.QuestionRepository;
import com.lancer.Question.Game.repositories.QuizRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final QuestionRepository questionRepo;
    private final AnswerRepository answerRepo;




    public QuestionService(QuestionRepository questionRepo, AnswerRepository answerRepo) {
        this.questionRepo = questionRepo;
        this.answerRepo = answerRepo;
    }

    public Question createQuestion (String questionText){
        Question question = new Question();
        question.setContent(questionText);
        return this.questionRepo.save(question);
    }

    public void addAnswer (Question question,String text, boolean isCorrect){
        Answer answer = new Answer(text,isCorrect);
        answer.setQuestion(question);
        this.answerRepo.save(answer);
        /*
            ---------------------------
                ASK HRISTO ABOUT THAT!!!!!!!!!
            ---------------------------
         */
        //question.addAnswer(answer);
        //this.questionRepo.save(question);


    }
}
