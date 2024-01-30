import java.util.*;
interface compute
{
    double convert(double val);
}
class gbconvert implements compute
{
    public double convert(double val)
    {
        return val*1000000.0;
    }
}
class euroconvert implements compute
{
    public double convert(double val)
    {
        return val*90.0;
    }
}
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        compute c1=new gbconvert();
        compute c2=new euroconvert();
        System.out.println("enter gigabytes");
        double gb=sc.nextDouble();
        double kb=c1.convert(gb);
        System.out.println("kilobyte equivalant is "+kb);
        System.out.println("enter euros");
        double euro=sc.nextDouble();
        double rs=c2.convert(euro);
        System.out.println("rupees equivalant is "+rs);
    }   
}
