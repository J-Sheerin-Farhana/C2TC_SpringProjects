package com.tnsif.college;

public class Student {
    private int sid;
    private String sname;
    private String course;
    public Student() {
    	
    }
    public Student(int sid,String sname,String course) {
    	this.sid=sid;
    	this.sname=sname;
    	this.course=course;
    }
    
    private College c1;
    
    public void display() {
    	c1.show();
    }
    
    public College getC1() {
		return c1;
	}
	public void setC1(College c1) {
		this.c1 = c1;
	}
	public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
    }
}