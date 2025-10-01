package ie.atu;

public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }
    public int subtract(int firstNum, int secondNum)
    {
        return firstNum - secondNum;
    }
    public int multiply(int firstNum, int secondNum)
    {
        return firstNum * secondNum;
    }
    public int divide(int firstNum, int secondNum)
    {
        if(firstNum == 0||secondNum == 0) {
        return 0;
        }
        return firstNum / secondNum;
    }
}
