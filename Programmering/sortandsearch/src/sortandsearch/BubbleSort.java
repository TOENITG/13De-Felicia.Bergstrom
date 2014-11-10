package sortandsearch;

public class BubbleSort {
    
    static void Bubblesort(int[] aryNums){
            
            int i;
            int temp;
            boolean swapped;
//Sorteringsalgoritmen Bubble.        
            do {
                swapped = false;
                    for(i=0; i < aryNums.length-1; i++)
                    {
                        if(aryNums[i] > aryNums[i + 1])
                        {
                            temp = aryNums[i];
                            aryNums[i] = aryNums[i + 1];
                            aryNums[i + 1] = temp;
                            swapped = true;
                        }
                    }
            }
            while (swapped);
    }
    
    
    static void PrintingArray(int[] ArraytoPrint) 
    {
        int i;
//Skriver ut de olika talen i rader om 10.
        for(i=0; i<100; i++) {
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ", ArraytoPrint[i]);
        }
    }
//Gör så att det skrivs ut slumpvalda tal.
        static int randomize(int maximum){ 
        return (int)(Math.random()*maximum) + 1;
    }
             
    

    public static void main(String[] args) {
        int[] theArray;

//Gör så att de slumpvalda talen är mellan 0 och 100.
        theArray = new int[100];
        for (int i=0; i<100; i++){
            theArray[i] = randomize(100);
        }     
        PrintingArray(theArray);
    
//Skriver ut siffrorna och dess sortering.
        Bubblesort(theArray);
        System.out.println();

        System.out.println();   
        PrintingArray(theArray);
    }
}