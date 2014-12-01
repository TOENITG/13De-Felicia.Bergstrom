package fragespart;

import java.util.Scanner;

public class Fragespart {

    public static void main(String[] args) {
        
        Scanner user_input = new Scanner( System.in );
        
        //Frågan
        int points =0;
        String first;
        System.out.println("Fråga?");
        first = user_input.next();
        
        //Poängen
        points += Answer(first);
}
        
        static int Answer(String first){
            int answer = 0;
            int point = 1;    
        if(first.equals("Yes")){
             answer =  point;
        }
        else {
            System.out.println("Försök igen!");      
        }
        return answer;
}
}