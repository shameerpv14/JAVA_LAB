import java.util.Scanner;
class Excep
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
a=sc.nextInt();
System.out.println("Enter 2nd number");
b=sc.nextInt();
try
{
        int c=a/(a-b);
        System.out.println("c="+c);
}
catch(ArithmeticException e)
{
System.out.println("Aritematic Exception:--" +e);
}
finally
{
System.out.println("Finally block");
}
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("the end");
}
}
