import java.util.*;
class Circle
{
	private double x,y,r;
	Circle()
	{
		x=3;
		y=4;
		r=5;
	}
	Circle(int r)
	{
		x=4;
		y=5;
		this.r=r;
	}
	Circle(int l,int r)
	{
		this.x=l;
		this.y=l;
		this.r=r;
	}
	Circle(int x,int y,int r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
	}
	double area()
	{
		return 3.14*r*r;
	}
	double circumference()
	{
		return 2*3.14*r;
	}
	double diameter()
	{
		return 2*r;
	}
}
public class P6
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int x,y,r;
	    while(true)
	    {
		System.out.println("\n\n1.Default Circle");
		System.out.println("2.Specific radius cirlce");
		System.out.println("3.Specific same coordinate and radius circle");
		System.out.println("4.Specific different coordinate and radius circle");
		System.out.println("5.Exit");
		System.out.print("\nEnter your choice :-");
		int choice=sc.nextInt();
		switch(choice)
		{
		    case 1:
				Circle s1=new Circle();
		    	System.out.println("Area of s1 = "+s1.area());
		        System.out.println("Circumference of s1 = "+s1.circumference());
		        System.out.println("Diameter of s1 = "+s1.diameter());
		        break;

		  	case 2:
				System.out.print("\nEnter Circle radius :- ");
		        r=sc.nextInt();
		        Circle s2=new Circle(r);
		         
		        System.out.println("\n\nArea of s2 = "+s2.area());
		        System.out.println("Circumference of s2 = "+s2.circumference());
		        System.out.println("Diameter of s2 = "+s2.diameter());
		        break;
		  
		  	case 3:
				System.out.print("\nEnter both coordinate same value :- ");
		      	x=sc.nextInt();
		      	System.out.println("\nEnter radius value : ");
		      	r=sc.nextInt();
		      	Circle s3=new Circle(x,r);
		      	System.out.println("\n\nArea of s3 = "+s3.area());
		        System.out.println("Circumference of s3 = "+s3.circumference());
		        System.out.println("Diameter of s3 = "+s3.diameter());
		      	break;

		 	case 4:
				System.out.print("\nEnter coordinate x,y and radius value :- ");
		  		x=sc.nextInt();
		  		y=sc.nextInt();
		  		r=sc.nextInt();
		  		Circle s4=new Circle(x,y,r);
		  		System.out.println("\n\nArea of s4 = "+s4.area());
				System.out.println("Circumference of s4 = "+s4.circumference());
				System.out.println("Diameter of s4 = "+s4.diameter());
				break;
				
			case 5:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("\nPlease,enter valid choice");
				break;
		}
	    }
	}
}
 
