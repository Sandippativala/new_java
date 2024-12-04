class OddThread extends Thread
{
    public void run()
    {
        try
        {
         for(int i=1;i<=100;i+=2)
          {
           System.out.println("Odd Number : "+i);
           sleep(500);
          }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class PrimeThread implements Runnable
{
    public void run()
    {
        int i,j;
        try
        {
            for(i=1;i<=100;i++)
            {
                for(j=2;j<i;j++)
                {
                    if(i%j==0)
                    break;
                }
       
            if(j==i)
            {
                Thread.sleep(1000);
                System.out.println("Prime Number : "+i);
            }
            }
          
        }
        catch(InterruptedException e)
        {
                e.printStackTrace();
        }
    }
}
public class P13 {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        Thread th = new Thread(new PrimeThread());
        th.start();
        ot.start();
    }
}
