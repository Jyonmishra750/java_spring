package org.jt.spring_web;

public class Person {
    
    private String name;
    private int roll;
    private double fee;
    private String qualification;
    private String location;
    private String email;
    
    public Person() {
    }

    public Person(String name, String qualification, String location, String email, String contact) {
        this.name = name;
        this.qualification = qualification;
        this.location = location;
        this.email = email;
        this.contact = contact;
    }
    
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    private String contact;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    
}
