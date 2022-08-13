/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilingual_Exam_T3;

/**
 *
 * @author jorge
 */
public class Course {
    
    private int code;
    private String name, associatedDepartment;

    public Course() {
        this.code = 0;
        this.name = "";
        this.associatedDepartment = "";
    }
    
    public Course(int cod, String na, String associatedDepartment) {
        if(setCode(cod)){
            this.code = cod;
        }
        
        setName(na);
        
        this.associatedDepartment = associatedDepartment;
    }
    
    public Course(Course other) {
        this.code = other.code;
        this.name = other.name;
        this.associatedDepartment = other.associatedDepartment;
    }

    public int getCode() {
        return code;
    }

    public boolean setCode(int cod) {
        if(cod>=0){
            return true;
        }
        
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getAssociatedDepartment() {
        return associatedDepartment;
    }

    public void setAssociatedDepartment(String associatedDepartment) {
        this.associatedDepartment = associatedDepartment;
    }

    public int howManyCourses(Class cl){
        int count = 0;
        
        if(cl.getDepartment().equals(associatedDepartment)){
            count++;
        }
        
        return count;
    }
    
    public String toString() {
        return "Course{" + "code=" + code + ", name=" + name + ", associatedDepartment=" + associatedDepartment + '}';
    }
    
    
    
    
}
