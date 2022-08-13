/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilingual_Exam_T3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author jorge
 */
public class Student {
    
    private int ID, level;
    private String name, surname;
    private LocalDate birth; 

    public Student() {
        this.ID = 0;
        this.level = 0;
        this.name = "";
        this.surname = "";
        this.birth = birth.now();
    }
    
    public Student(int Id, int lev, String na, String surn, LocalDate birthd) {
        if(setID(Id)){
            this.ID = Id;
        }
        
        this.level = level;
        
        if(setName(na)){
            this.name = na;
        }
        
        if(setSurname(surn)){
            this.surname = surn;
        }
        
        if(setBirth(birthd)){
            this.birth = birthd;
        }
        
    }
    
    public Student(Student other) {
        this.ID = other.ID;
        this.level = other.level;
        this.name = other.name;
        this.surname = other.surname;
        this.birth = other.birth;
    }

    public int getID() {
        return ID;
    }

    public boolean setID(int Id) {
        if(Id>0){
            return true;
        }
        
        return false;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String na) {
        if(na.length()>=2){
            return true;
        }
        
        return false;
    }

    public String getSurname() {
        return surname;
    }

    public boolean setSurname(String surn) {
        if(surn.length()>=2){
            return true;
        }
        
        return false;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public boolean setBirth(LocalDate birthd) {
        if(birthd.isBefore(birthd.now())){
            return true;
        }
        
        return false;
    }
    
    public void writeInformation(){
        
        try{
            FileWriter fr = new FileWriter("/home/jorge/Escritorio/StudentID.txt");
            BufferedWriter br = new BufferedWriter(fr);
            
            br.write("ID: " + ID + "\n");
            br.write("Name: " + name+ "\n");
            br.write("Surname: " + surname + "\n");
            br.write("Level: " + level + "\n");
            br.write("BirthDay: " + birth + "\n");

        }catch(IOException error){
            System.err.println(error);
        }
        
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", level=" + level + ", name=" + name + ", surname=" + surname + ", birth=" + birth + '}';
    }
    
    
}
