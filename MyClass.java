import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        System.out.println("Enter the index of Fibonacci's Sequence (between -92 and 92 inclusive)!");
        Scanner scan = new Scanner(System.in);
        int top = scan.nextInt();
        System.out.println("\nFibonacci's Sequence:");
      System.out.println("Fibonacci #" + top + ": " + getFibNums(top));
    }
    
    private static long getFibNums(int iterations) {
        byte mult = 1;
        long num1 = 0;
        long num2 = 1;
        if(iterations <= 0) {
            mult = -1;
        }
        
        if(iterations == 0) return 0;
        System.out.println(0);
        if(iterations == 1) return 1;
        System.out.println(1);
        for(int i = 1; i < mult * iterations; i++) {
            long temp = num1 + mult * num2;
            num1 = num2;
            num2 = temp;
            System.out.println(num2);
        }
        return num2;
    }
}