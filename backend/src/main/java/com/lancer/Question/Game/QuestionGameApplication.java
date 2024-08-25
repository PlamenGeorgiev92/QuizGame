package com.lancer.Question.Game;

import com.lancer.Question.Game.models.Question;
import com.lancer.Question.Game.repositories.QuestionRepository;
import com.lancer.Question.Game.services.QuestionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuestionGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionGameApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(QuestionService questionService,QuestionRepository questionRepo) {
		return args -> {

			Question question = questionService.createQuestion("What is my name?");
			questionService.addAnswer(question,"Plamen", true);
			questionService.addAnswer(question,"Pavlin", false);
			questionService.addAnswer(question,"Teodora",false);

			Question question2 = questionService.createQuestion("Who is a girl?");
			questionService.addAnswer(question2,"Plamen", false);
			questionService.addAnswer(question2,"Pavlin", false);
			questionService.addAnswer(question2,"Teodora",true);







		};
	}
}
