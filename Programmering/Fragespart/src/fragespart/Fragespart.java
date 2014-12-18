package fragespart;

import java.util.Scanner;

public class Fragespart {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        String svar;
        do{
// Poängsystemet
            int poäng = 0;
// Frågorna
            System.out.println("1: Vad hette Leroy Jethro Gibbs första fru?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("shannon") || svar.equalsIgnoreCase("shannon gibbs")){
                poäng++;
            }

            System.out.println("2: Vad brukar Ziva David alltid ta fel på?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("talesätt") || svar.equalsIgnoreCase("ordspråk")){
                poäng++;
            }

            System.out.println("3: Anthony DiNozzo Jr är vilken slags fantast?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("filmfantast") || svar.equalsIgnoreCase("film")){
                poäng++;
            }

            System.out.println("4: Vilken agentur jobbar Marty Deeks egentligen för?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("lapd") || svar.equalsIgnoreCase("los angeles polis department")){
                poäng++;
            }

            System.out.println("5: Hur dog Caitlin Todd?");
            if(scan.nextLine().equalsIgnoreCase("skjuten")){
                poäng++;
            }

            System.out.println("6: Vilken agentur är Ziva Davids pappa chef över?");
            if(scan.nextLine().equalsIgnoreCase("mossad")){
                poäng++;
            }

            System.out.println("7: Vad lider Kensi Blyes f.d make av?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("ptsd")||svar.equalsIgnoreCase("posttraumatisk stresssyndrom")){
                poäng++;
            }

            System.out.println("8: Vad heter skådespelaren som spelar G.Callen?");
            if(scan.nextLine().equalsIgnoreCase("chris o'donnell")){
                poäng++;
            }

            System.out.println("9: Hur lyder Leroy Jethro Gibbs regel nummer 1?");
            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("never let suspects stay together") || svar.equalsIgnoreCase("låt aldrig misstänkta vara tillsammans")){
                poäng++;
            }

            System.out.println("10: Vilken agentur jobbade Sam Hannas fru för?");
            if(scan.nextLine().equalsIgnoreCase("cia")){
                poäng++;
            }
    // Utskrift av poäng när omgången är klar.        
            System.out.println(poäng + " av 10.\nVill du spela igen?");

            svar = scan.nextLine();
            if(svar.equalsIgnoreCase("nej")){
                System.out.println("Det tar jag som ett ja!");
                svar = "ja";
            }
        
        }
        while(svar.equalsIgnoreCase("ja"));
    }
}