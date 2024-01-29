import java.util.*;
class ComplexNumber
{
    private Double real;
    private Double imag;
    public ComplexNumber(double real,double imag)
    {
        this.real=real;
        this.imag=imag;
    }
    public ComplexNumber add(ComplexNumber other)
    {
        double t1=this.real+other.real;
        double t2=this.imag+other.imag;
        return new ComplexNumber(t1,t2);
    }
    public ComplexNumber sub(ComplexNumber other)
    {
        double t1=this.real-other.real;
        double t2=this.imag-other.imag;
        return new ComplexNumber(t1,t2);
    }
    public void increment()
    {
        this.real++;
        this.imag++;
    }
    public void decrement()
    {
        this.real--;
        this.imag--;
    }
    public boolean compare(ComplexNumber other)
    {
        return this.real==other.real && this.imag==other.imag;
    }
    public void disp()
    {
        System.out.println(this.real+" "+this.imag+"i");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double r1,r2,i1,i2;
        System.out.println("enter r1");
        r1=sc.nextDouble();
        System.out.println("enter i1");
        i1=sc.nextDouble();
        System.out.println("enter r2");
        r2=sc.nextDouble();
        System.out.println("enter i2");
        i2=sc.nextDouble();
        ComplexNumber c1=new ComplexNumber(r1,i1);
        ComplexNumber c2=new ComplexNumber(r2,i2);
        System.out.println("addition is");
        ComplexNumber sum=c1.add(c2);
        sum.disp();
        System.out.println("subtraction is");
        ComplexNumber diff=c1.sub(c2);
        diff.disp();
        System.out.println("increment is");
        c1.increment();
        c1.disp();
        c2.increment();
        c2.disp();
        System.out.println("decrement is");
        c1.decrement();
        c1.disp();
        c2.decrement();
        c2.disp();
        boolean val=c1.compare(c2);
           if(val==false)
           {
              System.out.println("unequal");
           }
        else{
            System.out.println("equal");
        }
    }
}
