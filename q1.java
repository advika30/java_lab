import java.util.*;
public class Main
{
    public static void quad()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b an c");
        Double a=sc.nextDouble();
        Double b=sc.nextDouble();
        Double c=sc.nextDouble();
        Double D=b*b-(4*a*c);
        if(D==0)
        {
            Double root=-b/(2*a);
            System.out.println("root 1="+root);
            System.out.println("root 2="+root);
        }
        else if(D>0)
        {
            Double root1=(-b+Math.sqrt(D))/(2*a);
            Double root2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("root 1="+root1);
            System.out.println("root 2="+root2);
        }
        else
        {
            Double real=-b/(2*a);
            Double imag=Math.sqrt(-D)/(2*a);
            System.out.println("root 1="+real+" "+imag+"i");
            System.out.println("root 2="+real+" "+(-imag)+"i");
        }
    }
    public static void mult()
    {
        int[] a1={1,2,3,4,5,6};
        int[] a2={2,4,6,8,10,12};
        int n=a1.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=a1[i]*a2[i];
            System.out.println(result[i]);
        }
    }
    public static void sort()
    {
         int[] a={14,10,9,3,5,1,3};
          int n=a.length;
          int temp,i,j;
         for(i=0;i<(n-1);i++)
         {
              for(j=0;j<(n-i-1);j++)
              { 
                  if(a[j]>a[j+1])
                  {
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                  }
              }
         }
         for(i=0;i<n;i++)
         {
             System.out.println(a[i]);
         }
    }
    public static void main(String[] args)
    {
        mult();
        sort();
        quad();
    }
}
