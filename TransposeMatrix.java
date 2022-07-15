//write a program to accept matrix from user and display transpose of matrix
import java.lang.*;
import java.util.*;
class ArrayX
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    ArrayX(int a,int b)
    {
        this.iRow=a;
        this.iCol=b;
        Arr = new int[iRow][iCol]; 
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(int i=0;i<iRow;i++)
        {
            for(int j = 0; j< iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }
    public void Display()
    {
        int i=0,j=0;
        for(i=0; i < iRow; i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void Transpose()
    {
        for(int i=0; i < iRow; i++)
        {
            for(int j=0; j < iCol;j++)
            {
                System.out.print(Arr[j][i]+" ");
            }
            System.out.println();
        }
      
    }
}
class TransposeMatrix
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int X = sobj.nextInt();
        System.out.println("Enter the number of Columns");
        int Y = sobj.nextInt();

        ArrayX obj = new ArrayX(X,Y);
        obj.Accept(); 
        obj.Display();
        System.out.println("Transpose of matrix");
        obj.Transpose();
       // obj.Display();

    }
}
