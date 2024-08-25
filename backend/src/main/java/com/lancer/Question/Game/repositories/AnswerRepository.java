package com.lancer.Question.Game.repositories;

import com.lancer.Question.Game.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
