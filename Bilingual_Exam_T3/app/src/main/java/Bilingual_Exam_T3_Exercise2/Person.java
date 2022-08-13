/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilingual_Exam_T3_Exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jorge
 * This class represent to a person.
 */
public class Person {
    
    private String firstname, lastname, email, gender, profession, hobbies;
    private int age;

/**
 * This is a default constructor.
 */
    public Person() {
        this.firstname = "";
        this.lastname = "";
        this.email = "";
        this.gender = "";
        this.profession = "";
        this.hobbies = "";
        this.age = 0;
    }
    
/**
 * This is a constructor per parameters.
 */   
    public Person(String firstname, String lastname, String email, String gender, String profession, String hobbies, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.profession = profession;
        this.hobbies = hobbies;
        this.age = age;
    }
    
/**
 * This is a copy constructor.
 */    
    public Person(Person other) {
        this.firstname = other.firstname;
        this.lastname = other.lastname;
        this.email = other.email;
        this.gender = other.gender;
        this.profession = other.profession;
        this.hobbies = other.hobbies;
        this.age = other.age;
    }

/**
 * This getter returns the name of the person.
 * @return return a String.
 */
    public String getFirstname() {
        return firstname;
    }
    
/**
 * This setter inicialize the name of the person.
 */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
/**
 * This getter returns the lastname of the person.
 * @return return a String.
 */
    public String getLastname() {
        return lastname;
    }
    
/**
 * This setter inicialize the lastname of the person.
 */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
/**
 * This getter returns the email of the person.
 * @return return a String.
 */
    public String getEmail() {
        return email;
    }
    
/**
 * This setter inicialize the email of the person.
 */
    public void setEmail(String email) {
        this.email = email;
    }
    
/**
 * This getter returns the gender of the person.
 * @return return a String.
 */
    public String getGender() {
        return gender;
    }
    
/**
 * This setter inicialize the gender of the person.
 */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
/**
 * This getter returns the profession of the person.
 * @return return a String.
 */
    public String getProfession() {
        return profession;
    }
    
/**
 * This setter inicialize the profession of the person.
 */
    public void setProfession(String profession) {
        this.profession = profession;
    }
    
/**
 * This getter returns the hoobbie of the person.
 * @return return a String.
 */
    public String getHobbies() {
        return hobbies;
    }
    
/**
 * This setter inicialize the hobbie of the person.
 */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
/**
 * This getter returns the age of the person.
 * @return return a int.
 */
    public int getAge() {
        return age;
    }
    
/**
 * This setter inicialize the age of the person.
 */
    public void setAge(int age) {
        this.age = age;
    }
    
/**
 * This toString() return the actually state of a person.
 * @return return a String.
 */
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", gender=" + gender + ", profession=" + profession + ", hobbies=" + hobbies + ", age=" + age + '}';
    }
 
/**
 * This method read a text file to inicialize the people and save of a ArrayList person.
 * @return return a ArrayList of this class.
 */
    public ArrayList <Person> addPeople(){
        ArrayList <Person> people = new ArrayList<>();
        
        try{
            FileReader fr = new FileReader("/home/jorge/Escritorio/sample.csv");
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            br.readLine();
            
            String [] content = new String [7];
            
            while((line=br.readLine())!=null){
                content = line.split(",");
                Person a = new Person(content[0], content[1], content[2], content[4], content[5], content[6], Integer.parseInt(content[3]));
                people.add(a);
            }
        }catch(IOException error){
            System.err.println(error);
        }
        
        return people;
    }
    
    
}
