//  */Input: Row 4  columns: 4
/* 
  $   *   *   *
  #   $   *   *   
  #   #   $   *
  #   #   #   $
 
*/ 
import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Pattern
{
    private int iRow,iCol;
    public Pattern(int a,int b)
    {
        this.iRow=a;
        this.iCol=b;
    }
    public void DisplayPattern()
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
               if(i==j)
               {
                   System.out.print("  $");
               }
               else if(i<j)
               {
                System.out.print("  *");
               }
               else
               {
                System.out.print("  #");
               }
               
            }
            System.out.println();
        }
          
    }
}
class Pattern13
{
    public static void main(String arg[])
    {
        Pattern obj = new Pattern(4,4);
        obj.DisplayPattern();
    }
}
