import java.util.*;
class polymorphism
{
    public void compare(String s1,String s2)
    {
        if(s1.compareTo(s2)==0)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("unequal");
        }
    }
    public void compare(String s1,String s2,int n)
    {
        int i;
        int flag=0;
        for(i=0;i<n;i++)
        if(s1.charAt(i)!=s2.charAt(i))
        {
            flag=1;
            break;
        }
        if(flag==0)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("unequal");
        }
    }
}
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        polymorphism obj=new polymorphism();
        System.out.println("enter string1");
        String s1=sc.nextLine();
        System.out.println("enter string2");
        String s2=sc.nextLine();
        obj.compare(s1,s2);
        System.out.println("enter umber of characters to compare");
        int n=sc.nextInt();
        obj.compare(s1,s2,n);
    }
}
