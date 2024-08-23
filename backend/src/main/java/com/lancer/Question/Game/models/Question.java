package com.lancer.Question.Game.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "question_content")
    private String content;

    @OneToMany(mappedBy = "question")

    // TO DO: proper wat for correct answer!!! Too Tired ZzZzZzZzZ
    private List<Answer> answers;

    public Question() {
    }

    public Question(String content, List<Answer> answers) {
        this.content = content;
        this.answers = answers;
    }





    @Override
    public String toString() {
        return "Question{" + "questionId=" + questionId + ", content='" + content + '\'' + ", answers=" + answers + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(questionId, question.questionId) && Objects.equals(content, question.content) && Objects.equals(answers, question.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, content, answers);
    }
}
