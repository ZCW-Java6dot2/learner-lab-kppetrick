package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
private Double totalStudyTime;
    public Student(String name) {
        super(name);
    }

    public void learn(Double numberOfHours) {
        totalStudyTime = numberOfHours;
    }

    public Double getTotalStudyTime() {return totalStudyTime;
    }
    public void setTotalStudyTime(Double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
}
