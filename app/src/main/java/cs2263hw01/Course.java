package cs2263hw01;

import java.util.*;
public class Course{

    private int courseNumber;
    private String courseName;
    private int courseCredits;
    private String department;
    private static Map<String, String> departments = Map.of(
            "CS","Computer Science",
            "CHEM","Chemistry",
            "PHYS","Physics",
            "MATH","Mathematics",
            "BTNY","Botany",
            "ZOO","Zoology");


    public Course(){}

    public Course(int courseNum, String name, int credits, String dept){
        if(departments.containsKey(dept)) {

            this.courseNumber = courseNum;
            this.courseName = name;
            this.courseCredits = credits;
            this.department = dept;
        }
        else throw new IllegalArgumentException("Invalid Department, Available Departments: " +
                departments.keySet().toArray().toString());
    }

    public Map<String, String> getDepartments(){
        return departments;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return (departments.get(department) + " " + courseNumber + " " + courseName + " " + courseCredits + " Credits");
    }
}