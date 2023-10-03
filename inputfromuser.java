package javatutorials;
import java.util.*;
public class inputfromuser {
    public static void main (String arr[]){
        try (Scanner sc = new Scanner(System.in)){ // Scanner <name> = new Scanner(System.in); ---- this is the formate for input from user.
        String name = sc.nextLine();         // store the input if string " String <name> = <name of scanner>.next();" next is only input 1 word so we use "nextLine" is for string 
            //int a = sc.nextInt();    "<name>.nextInt();" is used for input integer value 
            //int a = sc.nextFloat();    "<name>.nextFloat();" is used for input float value 
            //int a = sc.nextLong();    "<name>.nextLong();" is used for input long value 
            //int a = sc.nextDouble();    "<name>.nextDouble();" is used for input double value 
         System.out.println(name);
    }
    }
}
