import java.util.Scanner;

class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow.");
            return;
        }
        stackArray[++top] = value; 
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peep() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack :- ");
        int size = sc.nextInt();
        Stack stack = new Stack(size); 
        
        while (true) {
            System.out.println("\n1. PUSH \n2. POP \n3. PEEP \n4. DISPLAY \n5. EXIT");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped element is: " + poppedValue);
                    }
                    break;

                case 3:
                    int topValue = stack.peep();
                    if (topValue != -1) {
                        System.out.println("Top element is: " + topValue);
                    }
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
