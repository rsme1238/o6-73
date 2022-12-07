
package ornek6.pkg73;

import java.util.Scanner;

public class Ornek673 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
       
       
        
      
        System.out.println("Terim sayisi: ");
          double n= input.nextDouble();
        
        
         double f ,toplam;
         toplam=0;
          
          for(int i=1; i<=n; i++){
          
                f=1; 
               for(int j=1; j<i; j++){
                   f=f*j;
                 
            
               } 
                toplam += (double) i/f;
          }
         
          
          System.out.println(toplam );
          
    }
    
}
