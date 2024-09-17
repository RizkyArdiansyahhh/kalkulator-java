import java.util.*;
public class CharTest {
         public static void main ( String [] args ) {
         Scanner input = new Scanner ( System . in ) ;

         System.out.print("a : ");
         float a = input.nextFloat();

         System.out.print("operaot : ");
         char operator = input.next().charAt(0);

         System.out.print("b : ");
         float b = input.nextFloat();
         float hasil;

         if(operator == '+'){
             hasil = a + b;
             System.out.println("hasil = " + hasil);
         }else if(operator == '-'){
             hasil = a -b;
             System.out.println("hasil = " + hasil);
         }else if(operator == '*'){
             hasil = a *b;
             System.out.println("hasil = " + hasil);
         }else if(operator == '/'){
             if(b == 0){
                 System.out.println("semua yang dibagi 0 infinity");
             }else {
                 hasil = a / b;
                 System.out.println("hasil = " + hasil);
             }
         }else{
             System.out.println("masukkan operator yang benar");
         }




         }
 }