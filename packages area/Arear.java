package graphics;
import java.util.Scanner;
public class Arear
{
public void rect()
{
System.out.println("enter the length and breadth of rectangle");
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
int r=l*b;
System.out.println("area of the rectangle is" +r);
}
}
