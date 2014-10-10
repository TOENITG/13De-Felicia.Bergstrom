/* Skriv ett program som läser in Namn, Personnummer och Adress. Sedan skall programmet skriva utVälkommen <Namn>, då du fyller den <Del av personnummer som visar födelsedagen> kommer vi komma till dig, <Address> och fira dig. Detta är ett automatiskt meddelande.
 */

package inlamningsuppgift1;
import java.util.Scanner;

public class upp1 {

    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        
        String first_name;
        System.out.print("Fyll i ditt namn: ");
        first_name = user_input.next();
        
        String number_name;
        System.out.print("Fyll i ditt personnummer: ");
        number_name = user_input.next();
        
                int DayNumber = Integer.parseInt(number_name.substring(4,6));
               
                    String t = "";
                        if (DayNumber == 01 || DayNumber == 02 || DayNumber == 03 ) {
                            t = ( DayNumber + "a" );
                        }
                        else {
                            t = ( DayNumber + "e");
                        }
               
        String NumberNameChars = "";
        NumberNameChars = number_name.substring(2,4);
               
                switch(NumberNameChars) {
                        case "01":
                            NumberNameChars = "Januari";
                            break;
                        case "02":
                            NumberNameChars = "Februari";
                            break;
                        case "03":
                            NumberNameChars = "Mars";
                            break;
                        case "04":
                            NumberNameChars = "April";
                            break;
                        case "05":
                            NumberNameChars = "Maj";
                            break;
                        case "06":
                            NumberNameChars = "Juni";
                            break;
                        case "07":
                            NumberNameChars = "Juli";
                            break;
                        case "08":
                            NumberNameChars = "Augusti";
                            break;
                        case "09":
                            NumberNameChars = "September";
                            break;
                        case "10":
                            NumberNameChars = "Oktober";
                            break;
                        case "11":
                            NumberNameChars = "November";
                            break;
                        case "12":
                            NumberNameChars = "December";
                            break;
                }          
        
        String address_name;
        System.out.print("Fyll i adress: ");
        address_name = user_input.next();
        
        System.out.println("Välkommen " + first_name + "! Då du fyller år " + t + " " + NumberNameChars + "\nkommer vi komma till dig på " + address_name + " och fira dig.\n\nDetta är ett automatiskt meddelande." );
                
    }
    
}
