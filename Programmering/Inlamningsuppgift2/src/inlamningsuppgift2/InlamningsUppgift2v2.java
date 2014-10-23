package inlamningsuppgift2;
import java.util.Scanner;

public class InlamningsUppgift2v2 {

    public static void main(String[] args) {
        
        Scanner user_input=new Scanner( System.in );
        
        //The answer
        double answer;
        
        //Someone can now write in the consol, first number
        String something;
        System.out.println("Första talet, tack!");
        something=user_input.next();
        
        //Converting String to Int, first number
        String first_number=something;
        double firstnumber = Double.parseDouble(first_number);
        
        //Second number
        String somethingelse;
        System.out.println("Andra talet, tack!");
        somethingelse=user_input.next();
        
        //Converting second number
        String second_number=somethingelse;
        double secondnumber = Double.parseDouble(second_number);
        
        //Doing the math
        answer = firstnumber + secondnumber;
        
        System.out.println("Addition: " + answer);
        
        //Third number
        String somethingelseagain;
        System.out.println("Tredje talet, tack!");
        somethingelseagain=user_input.next();
        
        //Converting third number
        String third_number=somethingelseagain;
        double thirdnumber = Double.parseDouble(third_number);
        
        //Doing the math
        answer = (firstnumber + secondnumber) - thirdnumber;
        
        System.out.println("Subtraktion: " + answer);
        
        //Fourth number
        String somethingelseelse;
        System.out.println("Fjärde talet, tack!");
        somethingelseelse=user_input.next();
        
        //Converting fourth number
        String fourth_number=somethingelseelse;
        double fourthnumber = Double.parseDouble(fourth_number);
        
        //Doing the math
        answer = ((firstnumber + secondnumber) - thirdnumber) * fourthnumber;
        
        System.out.println("Multiplikation: " + answer);
        
        //Fifth number
        String somethingagainagain;
        System.out.println("Femte talet, tack!");
        somethingagainagain=user_input.next();
        
        //Converting fifth number
        String fifth_number=somethingagainagain;
        double fifthnumber = Double.parseDouble(fifth_number);
        
        //Doing the math
        answer =(((firstnumber + secondnumber) - thirdnumber) * fourthnumber / fifthnumber);
        
        System.out.println("Divison: " + answer);
        
    }
    
    //Clears everything!
    public final static void clearConsole(){
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        
    }
}
}   
