package arrayskitjamforelse;

import javax.swing.JOptionPane;

public class ArraySkitjamforelse {

    public static void main(String[] args) {
        
        String[] fragor = {
            "fråga1",
            "fråga2",
            "fråga3",
        };
        
        String[][] svar = {
            {"a"},
            {"b1","b2"},
            {"c"},
            {"d", "d2"},
        };
        
        for(int i = 0; i < svar.length; i++){
            
            String s = JOptionPane.showInputDialog(fragor[i]);
            
            for(int it = 0; it < svar[i].length; it++){
                
                if(svar[i][it].equalsIgnoreCase(s)){
                    
                System.out.println("YAY");
            }
            }
            
        }
    }
    
}
