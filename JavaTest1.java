import java.util.*;

public class JavaTest1 {
    public static void class1() {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int result;

        System.out.println("Set a number to x: ");
        x = scan.nextInt();

        System.out.println("Set a number to y: ");
        y = scan.nextInt();

        result = x + y;

        System.out.println("X plus Y: " + result);

        scan.close();
        
    }
    
}
