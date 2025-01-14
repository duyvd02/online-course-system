/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author toila
 */
public class QuizSubmission {
    private int submissionID;
    private int learnerID;
    private int quizID;
    private Date submissionDate;
    private String timeSpent;

    public QuizSubmission() {
    }

    public QuizSubmission(int submissionID, int learnerID, int quizID, Date submissionDate, String timeSpent) {
        this.submissionID = submissionID;
        this.learnerID = learnerID;
        this.quizID = quizID;
        this.submissionDate = submissionDate;
        this.timeSpent = timeSpent;
    }

    public int getSubmissionID() {
        return submissionID;
    }

    public void setSubmissionID(int submissionID) {
        this.submissionID = submissionID;
    }

    public int getLearnerID() {
        return learnerID;
    }

    public void setLearnerID(int learnerID) {
        this.learnerID = learnerID;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }
    
    
}
