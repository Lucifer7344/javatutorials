package javatutorials;

import java.util.Scanner;

public class conditional3 {
    public static void main(String arr[]){
     try(Scanner sc = new Scanner(System.in)){
         int a = sc.nextInt();
         int b = sc.nextInt();
         if(a==b){
            System.out.println("Equal");
         } 
         else if(a>b){
            System.out.println("a is greater");
         }
         else{
            System.out.println("b is greater");
         }
        
        }
    }
}


