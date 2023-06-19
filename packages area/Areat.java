package graphics;
import java.util.Scanner;
public class Areat
{
public void tri()
{
System.out.println("enter the hight amd base of your triangle");
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int h=sc.nextInt();
double t=.5*(i*h);
System.out.println("area of the triangle is" +t);
}
}
