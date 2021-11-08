package com.sonata.Question_2;

import java.util.ArrayList;
import java.util.List;
class Student {
   String name; 
   int marks; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getMarks() { 
      return marks; 
   } 
   public int getId() { 
      return id; 
   } 
   Student(String n, int a, int i){ 
      name = n; 
      marks = a; 
      id = i; 
   } 
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Marks: "+ this.getMarks() +                     
              " Id: "+ this.getId()+"]"); 
   }
}
public class Question_2 {
   public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Shreyas", 88, 1001)); 
      studentlist.add(new Student("Sam", 90, 1003)); 
      studentlist.add(new Student("Shreyas", 86, 1005)); 
      studentlist.add(new Student("Naveen", 80, 1010)); 
    
      System.out.println("Before Sorting the student data:"); 
 

      studentlist.forEach((s)->System.out.println(s));

      System.out.println("After Sorting the student data by Age:"); 
      
      studentlist.sort((Student s1, Student s2)->s1.getMarks()-s2.getMarks()); 

     
      studentlist.forEach((s)->System.out.println(s)); 
      
      
   }
}