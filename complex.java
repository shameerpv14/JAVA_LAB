import java.util.Scanner;
class ComNum
{
        int r,i;
        ComNum(){}
        ComNum(int r, int i){
        this.r=r;
        this.i=i;
}
ComNum Add(ComNum c1,ComNum c2)
{
        ComNum temp=new ComNum(0,0);
        temp.r=c1.r+c2.r;
        temp.i=c1.i+c2.i;
        return temp;
}
}

class Complex{
public static void  main(String args[])
{
ComNum c1=new ComNum(10,12);
ComNum c2=new ComNum(3,5);
ComNum c3=new ComNum();
c3=c3.Add(c1,c2);
System.out.println("Result is:"+c3.r+"+"+c3.i+"i");
}
}
