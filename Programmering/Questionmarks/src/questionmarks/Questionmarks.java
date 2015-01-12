package questionmarks;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questionmarks {

    static int askQuestion(String question, String answer1, String answer2){
        
        String svar;
        int correct=0;
// Scannar in användarens svar.       
        svar = JOptionPane.showInputDialog(question);
// Kollar upp om svaret är svarsalternativ 1. 
            if(svar.equalsIgnoreCase(answer1)){
                correct=1;             
            }
// Kollar upp om svaret är svarsalternativ 2.                
            if(svar.equalsIgnoreCase(answer2)){
                correct=1;             
            }
        return correct;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String svar;
        
        do{
// Poängsystemet
            int poäng = 0;
// Frågorna
            poäng += askQuestion("1: Vad hette Leroy Jethro Gibbs första fru?","shannon", "shannon gibbs");
            
            poäng += askQuestion("2: Vad brukar Ziva David alltid ta fel på?","talesätt", "ordspråk");
            
            poäng += askQuestion("3: Anthony DiNozzo Jr är vilken slags fantast?","filmfantast", "film");
            
            poäng += askQuestion("4: Vilken agentur jobbar Marty Deeks egentligen för?", "lapd", "los angeles police department");

            poäng += askQuestion("5: Hur dog Caitlin Todd?","skjuten", "mördad");
            
            poäng += askQuestion("6: Vilken agentur är Ziva Davids pappa chef över?","mossad", "mossad");
            
            poäng += askQuestion("7: Vad lider Kensi Blyes f.d make av?","ptsd", "posttraumatisk stress syndrom");

            poäng += askQuestion("8: Vad heter skådespelaren som spelar G.Callen?","chris o'donnell", "chris");

            poäng += askQuestion("9: Hur lyder Leroy Jethro Gibbs regel nummer 1?","never let suspects stay together", "låt inte misstänkta sitta tillsammans");

            poäng += askQuestion("10: Vilken agentur jobbade Sam Hannas fru för?","cia", "central intelligence agency");

// Räknar ihop och visar användarens poäng. Börjar om koden.
            svar = JOptionPane.showInputDialog(poäng + " rätt av 10.\nVill du spela igen?");
            
            if(svar.equalsIgnoreCase("nej")){
                System.out.println("Det tar jag som ett ja!");
                svar = "ja";
            }
        }
        while(svar.equalsIgnoreCase("ja"));
    }
}