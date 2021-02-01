package cs2263hw01;


import java.util.*;
public class CourseList {

   private List<Course> cList = new Vector<>();


   public CourseList(){
   }

   public void addCourse(Course c){
       cList.add(c);
   }

   public void addCourses(List<Course> cl){
       cList.addAll(cl);
   }

}
