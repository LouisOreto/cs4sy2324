/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4ch20oretoex2;

/**
 *
 * @author Giselle
 */
public class CS4Ch20OretoEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JavaClass Kafka = new JavaClass("Kafka", 70, 3087);
       JavaClass Gepard = new JavaClass("Gepard", 70, 1249);
       JavaClass IL = new JavaClass("Imbibitor Lunae", 50, 1614);
       Kafka.displayInfo();
       Gepard.displayInfo();
       IL.displayInfo();
       
       Song atw = new Song("All Too Well", "Taylor Swift", 2014);
       Song yb = new Song("Youngblood", "5 Seconds of Summer", 2016);
       Song hj = new Song("Hey, Jude", "The Beatles", 1968);
       
       Singer Louis = new Singer("Louis", 0, 0, atw);
       Louis.performForAudience(10);
       Louis.changeFavSong(yb);
       Louis.showSinger();
       
       Singer Rafa = new Singer("Rafa", 5, 6000, hj);
       Rafa.showSinger();
       System.out.println("Total Number of Perfomances: " + Singer.totalPerformances());
    }
    
}
