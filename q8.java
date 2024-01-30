import java.util.*;
public class Main 
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double result;
        try
        {
            System.out.println("enter numerator");
            double n=sc.nextDouble();
            System.out.println("enter denominator");
            double d=sc.nextDouble();
                if((n<0 && d>0) || (n>0 && d<0) || (d==0))
                {
                throw new ArithmeticException("result cannot be negative or denominator cannot be zero");
                }
            result=(n/d);
            System.out.println("result is "+result);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Exception: "+a.getMessage());
        }
         catch(Exception e)
        {
            System.out.println("enter valid number");
        }
    }
}
