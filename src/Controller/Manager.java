package Controller;

import common.Library;
import View.Menu;

public class Manager extends Menu {

    Library l;

    public Manager(String td, String[] mc, String exit) {
        super(td, mc, exit);
        l = new Library();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                superlativeEquation();
                break;
            case 2:
                quadraticEquation();
                break;
        }
    }
//allow user calculate Superlative Equation
    public void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = l.checkInputDouble();
        System.out.print("Enter B: ");
        double b = l.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        System.out.print("Number is odd: ");
        if (l.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (l.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (l.checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is even: ");
        if (l.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (l.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (l.checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is perfect square: ");
        if (l.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (l.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (l.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }

    //allow user calculate Quadratic Equation
    public void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = l.checkInputDouble();
        System.out.print("Enter B: ");
        double b = l.checkInputDouble();
        System.out.print("Enter C: ");
        double c = l.checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (l.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (l.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (l.checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (l.checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (l.checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (l.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (l.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (l.checkEven(c)) {
            System.out.print(b + " ");
        }
        if (l.checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (l.checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (l.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (l.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (l.checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (l.checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (l.checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    }
    
}
