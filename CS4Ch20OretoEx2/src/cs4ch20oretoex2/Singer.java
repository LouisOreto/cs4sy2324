/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4ch20oretoex2;

/**
 *
 * @author CHARM
 */
public class Singer {
    private String name;
    private static int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    public static int totalPerformances;
    
    public Singer(String n, int p, double e, Song f){
    this.name = n;
    this.noOfPerformances = p;
    this.earnings = e;
    this.favoriteSong = f;
    }
    
    public void performForAudience(int x){
    this.noOfPerformances += 1;
    this.earnings += 100 * x;
    }
    
    public void changeFavSong(Song s) {
    this.favoriteSong = s;
    }
    
    public String getName(){
        return name;
    }
    
    public static int getNoOfPerformances(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public Song getFavoriteSong(){
        return favoriteSong;
    }
    
    public void showSinger(){
    System.out.println("Singer: " + this.getName());
    System.out.println("Number of Performances: " + this.getNoOfPerformances());
    System.out.println("Earnings: " + this.getEarnings());
    System.out.println("Favorite Song: " + this.getFavoriteSong());
    System.out.println("");
    }
    
    public static int totalPerformances(){
        return getNoOfPerformances();
    }}
