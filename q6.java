import java.util.*;
abstract class bank
{
    public String name,acc;
    public double bal,intamt,intrate,intyear;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter person name");
        name=sc.nextLine();
        System.out.println("enter person accno");
        acc=sc.nextLine();
        System.out.println("enter account balance");
        bal=sc.nextDouble();
        System.out.println("enter interest duration");
        intyear=sc.nextDouble();
    }
    public void disp()
    {
        System.out.println("name is "+name);
        System.out.println("accno is "+acc);
        System.out.println("balance is "+bal);
        System.out.println("time of interest is "+intyear);
    }
    abstract void roi();
}
class sbi extends bank
{
    public void roi()
    {
        intrate=0.05;
        intamt=bal*intrate;
        System.out.println("interest rate is "+intrate);
        System.out.println("interest amount is "+intamt);
    }
}
class city extends bank
{
    public void roi()
    {
        intrate=0.1;
        intamt=bal*intrate;
        System.out.println("interest rate is "+intrate);
        System.out.println("interest amount is "+intamt);
    }
}
class canara extends bank
{
    public void roi()
    {
        intrate=0.12;
        intamt=bal*intrate;
        System.out.println("interest rate is "+intrate);
        System.out.println("interest amount is "+intamt);
    }
}
public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter number of people");
        int n=sc.nextInt();
        sbi[] b1=new sbi[n];
        city[] b2=new city[n];
        canara[] b3=new canara[n];
        System.out.println("enter details for sbi bank");
        for(i=0;i<n;i++)
        {
            b1[i]=new sbi();
            b1[i].getdata();
            b1[i].disp();
            b1[i].roi();
        }
        System.out.println("enter details for city bank");
        for(i=0;i<n;i++)
        {
            b2[i]=new city();
            b2[i].getdata();
            b2[i].disp();
            b2[i].roi();
        }
        System.out.println("enter details for canara bank");
        for(i=0;i<n;i++)
        {
            b3[i]=new canara();
            b3[i].getdata();
            b3[i].disp();
            b3[i].roi();
        }
        System.out.println("highest earner of sbi bank in is ");
        double max=0;
        int index=0;
         for(i=0;i<n;i++)
        {
            if(b1[i].intamt>max)
            {
                max=b1[i].intamt;
                index=i;
            }
        }
        b1[index].disp();
        b1[index].roi();
    }
}
