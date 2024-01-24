package org.jt.spring_web;

public class Course {
    private int slno;
    private String coursename;
    private String duration;
    private String fee;
    
    public Course() {
    }

    public Course(int slno, String coursename, String duration, String fee) {
        this.slno = slno;
        this.coursename = coursename;
        this.duration = duration;
        this.fee = fee;
    }
    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }
    public String getCoursename() {
        return coursename;
    }

    public void setCsoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    
    
}
