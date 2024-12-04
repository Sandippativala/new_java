package com.prac;

import java.util.Scanner;
import org.gvp.dcs.ds.*;
import org.gvp.dcs.shapes.*;

public class P16 {
    public static void main(String[] args) {

        // Sphere Class Object
        Sphere sp = new Sphere(5.0);
        sp.display();

        // Cube Class Object
        Cube cube = new Cube(4.0);
        cube.display();

        Scanner sc = new Scanner(System.in);
        // Stack Class
        Stack_DS s1 = new Stack_DS();
        System.out.println("1 Push");
        System.out.println("2 Pop");
        System.out.println("3 Traverse");
        System.out.println("4 Exit");
        Outerloop:
        while (true) {
            int c, value, pvalue;
            System.out.print("Select the Choice:=");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.print("Enter the Value:=");
                    value = sc.nextInt();
                    s1.push(value);
                    break;
                case 2:
                    pvalue = s1.pop();
                    if (pvalue != -1) {
                        System.out.println("Stack Top Value Pop is:=" + pvalue);
                        s1.top--;
                    }
                    break;
                case 3:
                    s1.traverse();
                    break;
                case 4:
                    break Outerloop;
                default:
                    System.out.println("Pls Enter Valid Choice.!!");
            }
        }
        // Queue Class
        Queue_DS q1 = new Queue_DS();
        System.out.println("1 Enqueue");
        System.out.println("2 Dequeue");
        System.out.println("3 Peek");
        System.out.println("4 Display");
        System.out.println("4 Exit");

        while (true) {
        int c, value, dvalue;
        System.out.print("Select the Choice:=");
        c = sc.nextInt();

        switch (c) {
        case 1:
        System.out.print("Enter the Value:=");
        value = sc.nextInt();
        q1.enqueue(value);
        break;
        case 2:
        q1.dequeue();
        break;
        case 3:
        q1.peek();
        break;
        case 4:
        q1.display();
        break;
        case 5:
        System.exit(0);
        default:
        System.out.println("Pls Enter Valid Choice.!!");
        }
        }
    }
}
