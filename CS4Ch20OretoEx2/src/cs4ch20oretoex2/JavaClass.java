/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4ch20oretoex2;

/**
 *
 * @author Giselle
 */
public class JavaClass {
    private String name;
    private int level;
    private int attack;
    
    public JavaClass(String n, int l, int a){
        this.name = n;
        this.level = l;
        this.attack = a;
    }
    
    public String getName(){
        return name;
    }
    
    public int getLevel(){
        return level;
    }
    
    public int getAttack(){
        return attack;
    }
    public void displayInfo(){
        System.out.println("Character Name: " + this.getName());
        System.out.println("Character Level: " + this.getLevel());
        System.out.println("Character Attack Value: " + this.getAttack());
        System.out.println("");
    }
}