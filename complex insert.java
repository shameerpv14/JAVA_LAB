import java.util.Scanner;
class ComNum
{
        int r,i;
        ComNum(){}
        ComNum(int r, int i)
{
this.r=r;
this.i=i;
}
ComNum Add(ComNum ga,ComNum gb)
{
        ComNum temp=new ComNum(0,0);
        temp.r=ga.r+gb.r;
        temp.i=ga.i+gb.i;
        return temp;
}
}

class Complex{
public static void  main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the real part of the first complex number");
int r1=sc.nextInt();
System.out.println("Enter the real part of the second complex number");
int r2=sc.nextInt();
System.out.println("Enter the imaginary part of the first complex number");
int i1=sc.nextInt();
System.out.println("Enter the imaginary  part of the second complex number");
int i2=sc.nextInt();
ComNum ga = new ComNum(r1,i1);
ComNum gb = new ComNum(r2,i2);
ComNum sum = new ComNum(0,0);
sum = sum.Add(ga,gb);
System.out.println("Result is:"+sum.r+"+"+sum.i+"i");
}
}