import java.util.*;

public class Keyboard {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
//        int a, b , c;
//        System.out.println("Enter two numbers");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = a + b;
//        System.out.println("Sum is "+c);
        sc.useRadix(2);
        int x = sc.nextInt();
        System.out.println(x);
    }
}
