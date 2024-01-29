import java.util.*;
class person
{
    public String name;
    public int age;
    public String gender;
    public person(String name,int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void disp()
    {
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("gender "+gender);
    }
}
class employee extends person
{
    public String dept;
    public String empid;
    public employee(String name,int age,String gender,String dept,String empid)
    {
        super(name,age,gender);
        this.dept=dept;
        this.empid=empid;
    }
    @Override
    public void disp()
    {
        super.disp();
        System.out.println("department "+dept);
        System.out.println("employee id "+empid);
    }
}
class student extends person
{
    public String course;
    public String stdid;
    public student(String name,int age,String gender,String course,String stdid)
    {
        super(name,age,gender);
        this.course=course;
        this.stdid=stdid;
    }
    @Override
    public void disp()
    {
        super.disp();
        System.out.println("course "+course);
        System.out.println("student id "+stdid);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("employee:");
        for(i=1;i<=3;i++)
        {
            System.out.println("enter name");
            String empname=sc.nextLine();
            System.out.println("enter age");
            int empage=sc.nextInt();
            sc.nextLine();
            System.out.println("enter gender");
            String empgen=sc.nextLine();
            System.out.println("enter department");
            String empdept=sc.nextLine();
            System.out.println("enter empid");
            String emplid=sc.nextLine();
            employee emp=new employee(empname,empage,empgen,empdept,emplid);
            emp.disp();
    }
    System.out.println("student:");
        for(i=1;i<=3;i++)
        {
            System.out.println("enter name");
            String stname=sc.nextLine();
            System.out.println("enter age");
            int stage=sc.nextInt();
            sc.nextLine();
            System.out.println("enter gender");
            String stgen=sc.nextLine();
            System.out.println("enter course");
            String stcourse=sc.nextLine();
            System.out.println("enter student id");
            String stdid=sc.nextLine();
            student std=new student(stname,stage,stgen,stcourse,stdid);
            std.disp();
    }
}
}
