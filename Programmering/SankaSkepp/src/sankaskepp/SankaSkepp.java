package sankaskepp;

import java.util.Scanner;

public class SankaSkepp {
    
    static String player1[][] = new String[10][10];

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
        Spelplan(player1);
        // Shoot(player1,player2);
        // Shoot(player2,player1);
}
        
//Spelplanen.
        static void Spelplan(String[][] spelplan) {
            
        Scanner user_input = new Scanner( System.in );
        
        System.out.println("0  1  2  3  4  5  6  7  8  9  10");
        for(int y = 0; y < spelplan[0].length; y++) {
            System.out.print(y+1);
            for(int x = 0; x < spelplan.length; x++) {
                if(spelplan[x][y] == null){
                    spelplan[x][y] = " ";
                }
                System.out.print("  " + spelplan[x][y]);
            }
            System.out.println();
        }
        String Skepp;
        System.out.println("Var vill du sätta ut ditt skepp?");
        Skepp = user_input.next();
        
        String Koordinat1 = "";
        Koordinat1 = Skepp.substring(0, 1);
        
        int spacePos = Skepp.indexOf(",");
        String Hej = "";
        Koordinat1 = Skepp.substring(0, (spacePos));
        
        String Koordinat2 = "";
        Koordinat1 = Skepp.substring(0, 1);
        
        int spacePon = Skepp.indexOf(",");
        String Hey = "";
        Koordinat2 = Skepp.substring((spacePon + 1), 3);
        
        System.out.println(spelplan[Integer.valueOf(Koordinat1)][Integer.valueOf(Koordinat2)]);
        
        spelplan[Integer.valueOf(Koordinat1)][Integer.valueOf(Koordinat2)] = "x";
    }
}

// Spara alla uppgifter kring spelplanerna.