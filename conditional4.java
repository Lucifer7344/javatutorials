package javatutorials;
import java.util.*;
public class conditional4 {
    public static void main(String arr[]){
    try(Scanner sc = new Scanner(System.in)){
        int button = sc.nextInt();
        switch (button){
            case 1: System.out.println("hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }
    }
    }
}
