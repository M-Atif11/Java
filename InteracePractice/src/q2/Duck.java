/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2;

/**
 *
 * @author William's
 */
public class Duck implements flyable, swimmable {
    private String name;
    private double speed;
    
    public void Duck(String name, double speed){
        this.name=name;
        this.speed=speed;
    }
    
    @Override
    public void fly(){
        System.out.println("It can fly");
    }
    
    @Override
    public void swim(){
        System.out.println("It can swim");
    }
    
}
