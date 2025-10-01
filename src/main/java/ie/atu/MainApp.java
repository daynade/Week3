package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNum = scan.nextInt();
        System.out.println("Please enter the second number");
        int secondNum = scan.nextInt();

        Calculator calc =new Calculator();
        int result = calc.add(2,5);
        int result2 = calc.subtract(2,5);
        System.out.println("Result: " + result);

        scan.close();
    }
}
