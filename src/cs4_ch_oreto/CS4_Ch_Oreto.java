/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_ch_oreto;

/**
 *
 * @author CHARM
 */
public class CS4_Ch_Oreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kname = "Kafka";
        byte klvl = 70;
        short katk = 3087;
                
        String gname = "Gepard";
        byte glvl = 70;
        short gatk = 1249;
        
        String iname = "Imbibitor Lunae";
        byte ilvl = 50;
        short iatk = 1614;
        
        boolean lvlcomp = klvl > ilvl;
        boolean atkcomp = gatk > iatk;
        boolean isKafkaLvl70 = true;
        boolean isGepardLvl70 = true;
        boolean isImbibitorLvl70 = false;
        
        boolean areAllCharsLvl70 = isKafkaLvl70 && isGepardLvl70 && isImbibitorLvl70;
        
        System.out.println("Stats for my team's main characters in the game Honkai Star Rail");
        System.out.println("");
        System.out.println("Character name: " + kname);
        System.out.println("level: " + klvl);
        System.out.println("attack: " + katk);
        System.out.println("");
        System.out.println("Character name: " + gname);
        System.out.println("level: " + glvl);
        System.out.println("attack: " + gatk);
        System.out.println("");
        System.out.println("Character name: " + iname);
        System.out.println("level: " + ilvl);
        System.out.println("attack: " + iatk);
        System.out.println("");
        System.out.println("Total levels: "+ (klvl+glvl+ilvl)); /* operator: sum */
        System.out.println("Kafka's lvl is higher than Imbibitor Lunae: "+ lvlcomp);/* operator: comparison */
        System.out.println("Gepard's atk is higher than Imbibitor Lunae: "+ atkcomp); /* operator: comparison */
        System.out.println("Are all characters at level 70: "+ areAllCharsLvl70); /* operator: logical */
    }
    
}
