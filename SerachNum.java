//Accept N number from user And acccept one more numer & search tht number is in it

import java.lang.*;
import java.util.*;

class ArrayX
{
    private int Arr[];

    public ArrayX(int iNo)
    {
        
        Arr = new int[iNo];
    }
    public void Accept()
    {
        int iCnt=0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Values :");

        for(iCnt=0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        int iCnt=0;
        System.out.println("Elements of Array are:");
        for(iCnt=0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
    public int Search(int iNo2)
    {
        int iCnt=0;
        for(iCnt=0;Cnt<Arr.length;iCnt++)
        {
            if(iNo2==Arr[iCnt])
            {
                break;
            }
        }
        return Arr[iCnt];
    }
}
class SearchNum
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iLength=0,iRet=0,iValue=0;

        System.out.println("Enter the Size for Array");
        iLength=sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);
        obj.Accept();
        obj.Display();

        System.out.println("enter the element to search");
        iValue = sobj.nextInt();
        iRet=obj.Search(iValue);
        System.out.println("Number is there"+iRet);

        obj = null;
    }
}