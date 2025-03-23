// n= 3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1
import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=" ";
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                str= j+ " ";
                System.out.print(str.repeat(i));
            }
            System.out.print("$");
        }
        
    }
}