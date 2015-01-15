package arrayskitjamforelse;

import javax.swing.JOptionPane;

public class ArraySkitjamforelse {

    public static void main(String[] args) {
        
        String[] fragor = {
            "Vad står M*A*S*H för?",
            "Vad heter huvudkaraktären?",
            "Tooooo much",
        };
        
        String[][] svar = {
            {"mobile army surgical hospital"},
            {"Hawkeye","benjamin franklin hawkeye pierce"},
            {"Yes"},
        };
        
        int poang = 0;
        
        for(int i = 0; i < fragor.length; i++){
            
            String s = JOptionPane.showInputDialog(fragor[i]);
            
            for(int it = 0; it < svar[i].length; it++){
                
                if(svar[i][it].equalsIgnoreCase(s)){
                    poang++;
                }
            }
        }
        System.out.println(poang + " rätt utav " + fragor.length + " möjliga.");
        
    }
    
}
