import java.util.Scanner;

public class utility {
    public static long factorial(long value){
        if(value < 0){
            System.out.println("please enter valid value");
        }
        long val = 1;
        for(int i =1; i <= value; i++){
            val = val * i;  
        }
        return val;
    }
    public  static  boolean isprime(int value){
        if(value <= 1){
            return  false;
        }
        else{
            for(int i = 2;  i <= Math.sqrt(value); i++){
                if(value % i == 0){
                    return false;
                }

            }
        }
        return true;
    }
    public static  boolean iseven(long value){
        return value % 2 == 0;
    }
    public static  boolean isodd(long value){
        return value % 2 != 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1.Factorial \n2.IsPrime \n3.Iseven \n4.Isodd \n5.Exit \n ");
            System.out.print("Enter your choice :-");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter value :-");
                    long val = sc.nextLong();
                    System.out.println("Factorial :-" + factorial(val) + "\n");
                    break;

                case 2:
                    System.out.print("Enter value :-");
                    int val1  = sc.nextInt();
                    System.out.println("isprime :-" + isprime(val1) + "\n");
                    break;
                case 3:
                    System.out.print("Enter value :-");
                    int val2  = sc.nextInt();
                    System.out.println("iseven :-" + iseven(val2) + "\n");
                    break;

                case 4:
                    System.out.print("Enter value :-");
                    int val3  = sc.nextInt();
                    System.out.println("isodd :-" + isodd(val3) + "\n");
                    break;
                
                case 5:
                    System.out.println("exit..");
                    sc.close();
                    return;

                default:
                    System.out.println("invliad choice");
                    break;
            }
        }
    }    
}
