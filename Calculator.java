package week2;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;

 
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    
    public double add() {
        return a + b;
    }

    
    public double subtract() {
        return a - b;
    }


    public double multiply() {
        return a * b;
    }

  
    public double divide() {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a (double): ");
        double a = sc.nextDouble();

        System.out.print("Enter b (double): ");
        double b = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine().trim().toLowerCase();

        
        Calculator calc = new Calculator(a, b);

     
        double result;
        switch (op) {
            case "add":
                result = calc.add();
                break;
            case "subtract":
                result = calc.subtract();
                break;
            case "multiply":
                result = calc.multiply();
                break;
            case "divide":
                try {
                    result = calc.divide();
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please use add, subtract, multiply or divide.");
                sc.close();
                return;
        }

        System.out.printf("Result of %s on %.2f and %.2f = %.2f%n", op, a, b, result);
        sc.close();
    }
}
