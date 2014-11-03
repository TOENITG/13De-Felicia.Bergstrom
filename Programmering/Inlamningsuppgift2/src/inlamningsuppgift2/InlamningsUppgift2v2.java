package inlamningsuppgift2;
import java.util.Scanner;

public class InlamningsUppgift2v2 {

    //Error messages
    static double felsteg() {
        //User input is OKIDOKI to this method
        Scanner user_input=new Scanner( System.in );

        try {
        String something=user_input.next();
        return Double.parseDouble(something);
        }
        catch (NumberFormatException err) {
            System.out.println( "Detta är inte ett tal, försök igen!" );
        }
        return
    }
    
    public static void main(String[] args) {
        

        double answer;
        
        
        //Someone can now write in the consol, first number
        System.out.print("Första talet, tack! ");
        double firstnumber = felsteg();
        
        
        //Second number
        System.out.println("Andra talet, tack! ");
        double secondnumber = felsteg();
        
        //Doing the math with second number
        answer = firstnumber + secondnumber;
        
        System.out.println("Addition: " + answer);
        
        
        //Third number
        System.out.println("Tredje talet, tack! ");
        double thirdnumber = felsteg();
        
        //Doing the math with third number
        answer = (firstnumber + secondnumber) - thirdnumber;
        
        System.out.println("Subtraktion: " + answer);
        
        
        //Fourth number
        System.out.println("Fjärde talet, tack! ");
        double fourthnumber = felsteg();
        
        //Doing the math with fourth number
        answer = ((firstnumber + secondnumber) - thirdnumber) * fourthnumber;
        
        System.out.println("Multiplikation: " + answer);
        
        
        //Fifth number
        System.out.println("Femte talet, tack! ");
        double fifthnumber = felsteg();
        
        //Doing the math with fifth number
        answer =(((firstnumber + secondnumber) - thirdnumber) * fourthnumber / fifthnumber);
        
        System.out.println("Divison: " + answer);
        
    }
}   
