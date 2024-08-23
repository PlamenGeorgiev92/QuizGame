package com.lancer.Question.Game.models;

import jakarta.persistence.*;


public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="answer_id")
    private Integer id;
    @Column(name="content")
    private String answerText;

    private Boolean isCorrect = false;

    @ManyToOne
    @JoinColumn(name="question_id", nullable=false)
    private Question question;






    public void setCorrect(){
        this.isCorrect = true;
    }




}
