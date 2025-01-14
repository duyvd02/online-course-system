/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author toila
 */
public class LectureExtraMaterial {
    private int extraMaterialID;
    private int lectureID;
    private int materialURL;

    public LectureExtraMaterial() {
    }
    
    public LectureExtraMaterial(int extraMaterialID, int lectureID, int materialURL) {
        this.extraMaterialID = extraMaterialID;
        this.lectureID = lectureID;
        this.materialURL = materialURL;
    }

    public int getExtraMaterialID() {
        return extraMaterialID;
    }

    public void setExtraMaterialID(int extraMaterialID) {
        this.extraMaterialID = extraMaterialID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public int getMaterialURL() {
        return materialURL;
    }

    public void setMaterialURL(int materialURL) {
        this.materialURL = materialURL;
    }
    
    
}
