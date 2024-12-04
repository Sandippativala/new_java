import java.util.Scanner;

class Matrix
{
    private int row,col;
    private int arr[][];

    Matrix(int row,int col)
    {
        this.row=row;
        this.col=col;
        arr=new int[row][col];
    }
    void intialize(int i,int j,int value)
    {
        arr[i][j]=value;
    }
    public Matrix add(Matrix m2)
    {
        Matrix result=new Matrix(row, col); 
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                 result.arr[i][j]=arr[i][j]+m2.arr[i][j];
            }
        }
        return result;
    }
    public Matrix sub(Matrix m2)
    {
        Matrix result=new Matrix(row, col); 
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                 result.arr[i][j]=arr[i][j]-m2.arr[i][j];
            }
        }
        return result;
    }
    public Matrix mul(Matrix m2)
    {
        Matrix result=new Matrix(row, m2.col); 
        for(int i=0;i<row;i++)
        {
             for(int j=0;j<m2.col;j++)
             {
                 for(int k=0;k<m2.row;k++)
                 {
                    result.arr[i][j]=result.arr[i][j]+(arr[i][k]*m2.arr[k][j]);
                 }
             }
        }
        return result;
    }
    public void transpose()
    {
        int array[][]=new int[col][row];
        for(int i=0;i<col;i++)
         {
            for(int j=0;j<row;j++)
               array[i][j]=arr[j][i];
         }
        int x=row;
        row=col;
        col=x;
        arr=array;
    }
    public String toString()
    {
        String s="";
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                   s=s+arr[i][j]+" ";
            }
            s=s+"\n";
        }
        return s;
    }
}
class P8
{
    public static void main(String[] args) {
        int col,row,col2,row2;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of column and row Of the First Matrix :-");
        col=s1.nextInt();
        row=s1.nextInt();
        Matrix m1=new Matrix(row, col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter First Matrix [" + i + "][" + j + "] value: ");
                int v = s1.nextInt();
                m1.intialize(i, j, v);
            }
        }
        System.out.print("Enter number of column and row Of the Second Matrix :-");
        col2=s1.nextInt();
        row2=s1.nextInt();

        Matrix m2=new Matrix(row2, col2);
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print("Enter First Matrix [" + i + "][" + j + "] value: ");
                int v = s1.nextInt();
                m2.intialize(i, j, v);
            }
        }
        System.out.println("\nMatrix 1 :");
        System.out.println(m1);
        System.out.println("\nMatrix 2 :");
        System.out.println(m2);

        Matrix result;
        while (true) {
            System.out.println("\n1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Transpose");
            System.out.println("5.exit");
            System.out.println("\nEnter your choice");
            int choice = s1.nextInt();
            switch (choice) {
                case 1:
                    result=m1.add(m2);
                    System.out.println(result);
                    break;

                case 2:
                    result=m1.sub(m2);
                    System.out.println(result);
                    break;

                case 3:
                    result=m1.mul(m2);
                    System.out.println(result);
                    break;

                case 4:
                    System.out.println("\n Enter 1 or 2 for Transpose first matrix or second matrix ");
                    int decide = s1.nextInt();
                    if(decide==1)
                        result=m1;
                    else
                        result=m2;
                    result.transpose();
                    System.out.println(result);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    s1.close();
                    System.exit(0);
            
                default:
                    System.out.println("please,enter valid choice");
                    break;
            }
        }

    }
}