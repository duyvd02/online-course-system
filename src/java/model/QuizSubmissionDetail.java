/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author toila
 */
public class QuizSubmissionDetail {
    private int quizSubmissionDetailID;
    private int quizSubmissionID;
    private int questionID;
    private int answerID;

    public QuizSubmissionDetail() {
    }

    public QuizSubmissionDetail(int quizSubmissionDetailID, int quizSubmissionID, int questionID, int answerID) {
        this.quizSubmissionDetailID = quizSubmissionDetailID;
        this.quizSubmissionID = quizSubmissionID;
        this.questionID = questionID;
        this.answerID = answerID;
    }

    public int getQuizSubmissionDetailID() {
        return quizSubmissionDetailID;
    }

    public void setQuizSubmissionDetailID(int quizSubmissionDetailID) {
        this.quizSubmissionDetailID = quizSubmissionDetailID;
    }

    public int getQuizSubmissionID() {
        return quizSubmissionID;
    }

    public void setQuizSubmissionID(int quizSubmissionID) {
        this.quizSubmissionID = quizSubmissionID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }
    
    
}
