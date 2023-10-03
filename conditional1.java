package javatutorials;
import java.util.*;
public class conditional1 {
    public static void main(String arr[]){
       try ( Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not Adult");
        }
       }
    }
    
}
