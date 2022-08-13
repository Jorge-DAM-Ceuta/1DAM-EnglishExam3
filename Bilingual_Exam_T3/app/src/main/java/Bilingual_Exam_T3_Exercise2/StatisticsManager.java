/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilingual_Exam_T3_Exercise2;

import java.util.ArrayList;

/**
 * This class contains statistics of a person group.
 * @author jorge
 */
public class StatisticsManager {
    
    private ArrayList <Person> people;

/**
 * This is a default constructor.
 */   
    public StatisticsManager() {
        this.people = new ArrayList<>();
    }
 
/**
 * This is a constructor per parameters.
 */    
    public StatisticsManager(ArrayList<Person> people) {
        this.people = people;
    }

/**
 * This is a copy constructor.
 */     
    public StatisticsManager(StatisticsManager other) {
        this.people = other.people;
    }

/**
 * This getter returns ArrayList.
 * @return return a ArrayList of person class.
 */
    public ArrayList<Person> getPeople() {
        return people;
    }

/**
 * This setter inicialize the ArrayList of person class with other ArrayList.
 */    
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
     
/**
 * This method calculate the number of people from some conditions.
 */
    public void calculateNumber1(){
        int count=0;
        
        for(int i=0; i<people.size(); i++){
            if(people.get(i).getAge()<30 && people.get(i).getHobbies().equals("music")){
                count++;
            }
        }
        
        System.out.println(count);
    }
    
/**
 * This method calculate the number of people from some conditions.
 */    
    public void calculateNumber2(){
        int count=0;
        
        for(int i=0; i<people.size(); i++){
            if(people.get(i).getLastname().length()>=10 && people.get(i).getProfession()=="doctor"){
                count++;
            }
        }
        
        System.out.println(count);
    }
    
/**
 * This method calculate the number of people from some conditions.
 */   
    public void calculateNumber3(){
        int count=0;
        
        for(int i=0; i<people.size(); i++){
            if(people.get(i).getGender().equals("non-binary") && people.get(i).getAge()>=50){
                count++;
            }
        }
        
        System.out.println(count);
    }
    
/**
 * This method save the person objects if that conditions are true with first ArrayList to other ArrayList.
 * @return return a ArrayList of person class.
 */    
    public ArrayList<Person> returnDevelopersGroup(){
        ArrayList <Person> peoples = new ArrayList<>();
        
        for(int i=0; i<people.size(); i++){
            if(people.get(i).getProfession().equals("developer") && people.get(i).getHobbies().equals("videogamming")){
                peoples.add(people.get(i));
            }
        }
        
        return peoples;
    }
    
/**
 * This method save the person objects if that conditions are true with first ArrayList to other ArrayList.
 * @return return a ArrayList of person class.
 */     
    public ArrayList<Person> returnGroup2(){
        ArrayList <Person> peoples = new ArrayList<>();
        
        for(int i=0; i<people.size(); i++){
            if(people.get(i).getAge()>=20 && people.get(i).getAge()<=40){
                if(people.get(i).getHobbies().equals("running")){
                    if(people.get(i).getProfession().equals("police officer") || people.get(i).getProfession().equals("firefighter")){
                        peoples.add(people.get(i));
                    }
                }
            }
        }
        
        return peoples;
    }
    
/**
 * This method save the person objects if that conditions are true with first and second ArrayList to other ArrayList.
 * @return return a ArrayList of person class.
 */   
    public ArrayList<Person> returnGroup3(ArrayList <Person> a, ArrayList <Person> b){
        ArrayList <Person> peoples = new ArrayList<>();
        
        for(int i=0; i<a.size(); i++){
            if(a.get(i).getProfession().equals("teacher") && a.get(i).getHobbies().equals("reading")){
                peoples.add(a.get(i));
            }
        }
        
        for(int i=0; i<a.size(); i++){
            if(b.get(i).getProfession().equals("teacher") && b.get(i).getHobbies().equals("reading")){
                peoples.add(b.get(i));
            }
        }
        
        return peoples;
    }

/**
 * This method count the number of people has been add to ArrayList in this method's.
 * @return return a int.
 */
    public int numberStatistics(){
        return people.size();
    }
    
/**
 * This toString() return the actually state of a person.
 * @return return a String.
 */    
    public String toString() {
        return "StatisticsManager{" + "people=" + people + '}';
    }
    
    
    
}
