package sankaskepp;

import java.util.Scanner;

public class SankaSkepp {

    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
//Välkomsttext.        
        String Start;
        System.out.println("Välkommen! Redo att se intruktionerna?");
        Start = user_input.next();
//Instruktioner.        
        String Instruktioner;
        System.out.println("Intruktioner ... Redo att köra?");
        Instruktioner = user_input.next();
        Spelplan();
}
        
//Spelplanen.
        static void Spelplan() {
        
        String Hej[][] = new String[10][10];
// Koordinater.        
        Hej[0][0] = "1";
        Hej[0][1] = "2";
        Hej[0][2] = "3";
        Hej[0][3] = "4";
        Hej[0][4] = "5";
        Hej[0][5] = "6";
        Hej[0][6] = "7";
        Hej[0][7] = "8";
        Hej[0][8] = "9";
        Hej[0][9] = "10";
        
        Hej[1][0] = "2";
        Hej[2][0] = "3";
        Hej[3][0] = "4";
        Hej[4][0] = "5";
        Hej[5][0] = "6";
        Hej[6][0] = "7";
        Hej[7][0] = "8";
        Hej[8][0] = "9";
        Hej[9][0] = "10";
// Utplacering av koordinater.       
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(Hej[i][j] == null){
                    Hej[i][j] = " ";
                }
// Skriver ut de vågräta koordinaterna.                
                System.out.print(Hej[i][j] + " " + " " );
            }
// Skriver ut de lodräta koordinaterna.
            System.out.println();
        }
    }
}
// Spara koordinaterna för att veta om skeppen har sjunkit eller ej.