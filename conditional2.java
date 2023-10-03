package javatutorials;
import java.util.*;
public class conditional2 {
    public static void main(String arr[]){
     try(Scanner sc = new Scanner(System.in)){
         int a = sc.nextInt();
         if(a%2 == 0){
            System.out.println("number is even");
         }
           else {
            System.out.println("number is odd");
           }
        }
    }
}
