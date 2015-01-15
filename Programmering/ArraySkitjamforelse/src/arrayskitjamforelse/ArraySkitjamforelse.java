package arrayskitjamforelse;

import javax.swing.JOptionPane;

public class ArraySkitjamforelse {

    public static void main(String[] args) {
// En array med frågor.        
        String[] fragor = {
            "Vad heter huvudkaraktären i House?",
            "Vad heter hans bästa vän?",
            "Vad heter huvudkaraktärens exchef?",
            "Inom vilket område jobbar bästa vännen i?",
            "Dog huvudkarakären?",
            "Vad gör huvudkaraktären för att åka in i fängelset?",
            "Vilken kanal sändes House på i Sverige?",
            "Hur iscensatte huvudkarakären sin död?",
            "Vilken sjukdom fick bästa vännen?",
            "Vilket språk är originalserien på?",
        };
// En multidimensionell (för att ha fler svar) array med svar.        
        String[][] svar = {
            {"dr. gregory house", "house"},
            {"dr. james wilson", "wilson"},
            {"dr. lisa cuddy", "cuddy"},
            {"onkologi"},
            {"Nej"},
            {"Åker in i ett hus"},
            {"TV4"},
            {"En brand"},
            {"Cancer"},
            {"Engelska"},
        };
        
        int poang = 0;
// Skriver ut frågorna i input rutor.        
        for(int i = 0; i < fragor.length; i++){
            
            String s = JOptionPane.showInputDialog(fragor[i]);
// Jämför användarens svar med svaren i koden.            
            for(int it = 0; it < svar[i].length; it++){
                
                if(svar[i][it].equalsIgnoreCase(s)){
                    poang++;
                }
            }
        }
// Skriver ut hur många rätta svar användaren har.        
        System.out.println(poang + " rätt utav " + fragor.length + " möjliga.");
        
    }
    
}
