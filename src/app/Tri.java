package app;

public class Tri{
    public static void trier(int[] tableau){
        int i, j, cle;
        
        for (i = 1; i < tableau.length; i++){
            cle = tableau[i];
            j = i;
        
            while ((j >= 1) && (tableau[j - 1] > cle)){
                tableau[j]  = tableau[j - 1] ;
                j = j - 1;
            }
        
            tableau[j] = cle;
        }
    }
} 
