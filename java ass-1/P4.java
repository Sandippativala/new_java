import java.util.Scanner;

class Number
{
    private double value;

    public Number(double d) {
        value=d;
    }
    public boolean isZero()
    {
        if(value==0)
            return true;
        else
            return false;
    }
    public boolean isPositive()
    {
        if(value>0)
            return true;
        else
            return false;
    }
    public boolean isNegative()
    {
        return !isPositive();
    }
    public boolean isEven()
    {
        if(value%2==0)
            return true;
        else
            return false;
    }
    public boolean isOdd()
    {
        return !isEven();
    }
    public double getFactorial()
    {
        double fact=1;
        for(int i=1;i<=(int)value;i++)
          fact=fact*i;
        return fact;
    }
}
public class P4 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("\nEnter One Number :- ");
        int no=s1.nextInt();
        Number n=new Number(no);
        if(n.isZero())
            System.out.println(no+" is Zero");
        if(n.isPositive())
            System.out.println(no+" is Positive");
        if(n.isNegative())
            System.out.println(no+" is Negative");
        if(n.isOdd())
            System.out.println(no+" is Odd");
        if(n.isEven())
            System.out.println(no+" is Even");
        System.out.println(no+" factorial is : "+n.getFactorial());
        s1.close();
    }
 
}
