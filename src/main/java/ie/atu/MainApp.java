package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //Getting user inputted values
        System.out.println("Please enter the first number");
        int firstNum = scan.nextInt();
        System.out.println("Please enter the second number");
        int secondNum = scan.nextInt();
        //Initialising class calculator
        Calculator calc =new Calculator();
        int result = calc.add(firstNum,secondNum);
        int result2 = calc.subtract(firstNum,secondNum);
        int result3 = calc.multiply(firstNum,secondNum);
        int result4 = calc.divide(firstNum,secondNum);
        int result5 = calc.power(firstNum,secondNum);
        int result6 = calc.modulo(firstNum,secondNum);
        //Results printed
        System.out.println("Addition: "+result);
        System.out.println("Subtraction: "+result2);
        System.out.println("Multiplication: "+result3);
        if(firstNum == 0||secondNum==0){ //A check for divide by 0
            System.out.println("Can't divide by zero");
        }
        else{
            System.out.println("Division: "+result4);
        }
        System.out.println("Powers: "+result5);
        System.out.println("Modulo: "+result6);


        scan.close();
    }
}
