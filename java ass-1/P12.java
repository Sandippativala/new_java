import java.util.Scanner;

class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

class Stack {
    private int[] stackArray; 
    private int top;     
    private int capacity;     

    public Stack(int size) {
        this.capacity = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int value) throws StackException {
        if (top == capacity - 1) {
            throw new StackException("Stack Overflow: Cannot push " + value + ", the stack is full.");
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed onto the stack.");
    }

    public int pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack Underflow: Cannot pop, the stack is empty.");
        }
        int value = stackArray[top--];
        System.out.println(value + " popped from the stack.");
        return value;
    }

    public int peep() throws StackException {
        if (top == -1) {
            throw new StackException("Stack is empty: Cannot peek.");
        }
        return stackArray[top];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class P12 {
    public static void main(String[] args) {
    try{
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
    } catch (StackException e) {
        System.out.println(e.getMessage());
    }
    }
}
