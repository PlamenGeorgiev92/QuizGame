package com.lancer.Question.Game.models;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="quizzes")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="quiz_id")
    private Integer quizId;

    @Column(name="quiz_title")
    private String title;


    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name="quiz_question_junction",
            joinColumns = {@JoinColumn(name="quiz_id")},
            inverseJoinColumns = {@JoinColumn(name ="question_id")}
    )
    private Set<Question> questions;


    public Quiz() {
        this.questions = new HashSet<>();
    }

    public Integer getQuizId() {
        return quizId;
    }

    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion (Question question){
        this.questions.add(question);
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "quizId=" + quizId +
                ", title='" + title + '\'' +
                ", questions=" + questions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return Objects.equals(quizId, quiz.quizId) && Objects.equals(title, quiz.title) && Objects.equals(questions, quiz.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quizId, title, questions);
    }
}
