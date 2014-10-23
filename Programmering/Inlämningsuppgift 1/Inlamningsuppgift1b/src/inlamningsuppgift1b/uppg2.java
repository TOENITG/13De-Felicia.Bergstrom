package inlamningsuppgift1b;
import java.util.Scanner;

public class uppg2 {

    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in);
        
        String a;
        System.out.print("Första inmatningen? ");
        a = user_input.next(); {
                System.out.println(a);
                }
        
        String b; 
        System.out.print("Andra inmatningen? ");
        b = user_input.next(); {
                System.out.println(a + " " + b);
                }
        
        String c;
        System.out.print("Tredje inmatningen? ");
        c = user_input.next(); {
                System.out.println(a + " " + b + " " + c);
                }
        
        String d;
        System.out.print("Fjärde inmatningen? ");
        d = user_input.next(); {
                System.out.println(a + " " + b + " " + c + " " + d);
                }
        
        String e;
        System.out.print("Femte inmatningen? ");
        e = user_input.next(); {
                System.out.println(a + " " + b + " " + c + " " + d + " " + e);
                }
    }
    
}