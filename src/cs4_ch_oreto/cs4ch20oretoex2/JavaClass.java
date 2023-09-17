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
    String name;
    int level;
    double attack;
    
    public JavaClass(String n, int l, double a){
        this.name = n;
        this.level = l;
        this.attack = a;
    }
    
    public void displayInfo(){
        System.out.println("Character Name: " + this.name);
        System.out.println("Character Level: " + this.level);
        System.out.println("Character Attack Value: " + this.attack);
        System.out.println("");
    }
}
