import java.lang.*;
import java.io.*;

public class Calculator {
    public float addNumbers(float x, float y) {
        return x + y;
    }
    public float divideNumbers(float x, float y) {
        return x - y;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.format("SUM %f", calculator.addNumbers(5, 4));
    }
}