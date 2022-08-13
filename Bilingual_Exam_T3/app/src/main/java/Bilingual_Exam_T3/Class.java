/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilingual_Exam_T3;

import java.time.LocalDate;

/**
 *
 * @author jorge
 */
public class Class {
    
    private String [] departments;
    private int level;
    private Student [] students;

    public Class() {
        this.departments = null;
        this.level = 0;
        this.students = null;
    }
    
    public Class(String [] depart, int lev, Student[] stud) {
        if(setDepartment(depart)){
            this.departments = depart;
        }
        
        if(setLevel(lev)){
            this.level = lev;
        }
        
        if(setStudents(stud)){
            this.students = stud;
        }
    }
    
    public Class(Class other) {
        this.departments = other.departments;
        this.level = other.level;
        this.students = other.students;
    }

    public String [] getDepartment() {
        return departments;
    }

    public boolean setDepartment(String [] depart) {
        if(depart.length<=5){
            return true;
        }
        
        return false;
    }

    public int getLevel() {
        return level;
    }

    public boolean setLevel(int lev) {
        if(lev>=1 && lev<=10){
            return true;
        }
        
        return false;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean setStudents(Student[] stud) {
        if(stud.length>=1){
            return true;
        }
        
        return false;
    }
    
    public void levelOfStudent(){
        for(int i=0; i<students.length; i++){
            students[i].setLevel(level);
        }
    }

    public int olderDate(LocalDate date){
        int count=0;
        
        for(int i=0; i<students.length; i++){
            if(students[i].getBirth().isBefore(date)){
                count++;
            }
        }
        
        return count;
    }
    
    
    
    public String toString() {
        return "Class{" + "department=" + departments + ", level=" + level + ", students=" + students + '}';
    }
    
    
}
