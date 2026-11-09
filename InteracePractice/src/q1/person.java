/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;



/**
 *
 * @author William's
 */
public class person implements InfoDisplay{
    private String name;
    private int age;
    private String occupation;
    
    public person(){}
    public void setName (String name){
        this.name=name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getOccupation(){
        return occupation;
    }
    
    @Override
    public void displayName(){
        System.out.println("Name: " + this.getName());
    }
    public void displayAge(){
        System.out.println("Age: " + this.getAge());
    }
    public void displayOccupation(){
        System.out.println("Occupation: " + this.getOccupation());
    }
}
