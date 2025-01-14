/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author toila
 */
public class LectureProgress {
    private int progressID;
    private int learnerID;
    private int lectureID;
    private int watchedPercentage;

    public LectureProgress() {
    }

    public LectureProgress(int progressID, int learnerID, int lectureID, int watchedPercentage) {
        this.progressID = progressID;
        this.learnerID = learnerID;
        this.lectureID = lectureID;
        this.watchedPercentage = watchedPercentage;
    }

    public int getProgressID() {
        return progressID;
    }

    public void setProgressID(int progressID) {
        this.progressID = progressID;
    }

    public int getLearnerID() {
        return learnerID;
    }

    public void setLearnerID(int learnerID) {
        this.learnerID = learnerID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public int getWatchedPercentage() {
        return watchedPercentage;
    }

    public void setWatchedPercentage(int watchedPercentage) {
        this.watchedPercentage = watchedPercentage;
    }
    
    
}
