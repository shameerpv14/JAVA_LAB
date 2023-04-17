import java.util.Scanner;
class Mca
{
String dname , hname;
int strength;
void get(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Department name:");
dname=sc.next();
System.out.println("Enter the name of HOD:");
hname=sc.next();
System.out.println("Enter the Strength:");
strength=sc.nextInt();
}
void display()
{
System.out.println("Department name:" +dname);
System.out.println("HOD:" +hname);
System.out.println("Strength:" +strength);
}}

class S1 extends Mca
{
String sname,address;
int rollno;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the student name:");
sname=sc.next();
System.out.println("Enter the address:");
address=sc.next();
System.out.println("Enter the rollno:");
rollno=sc.nextInt();
}
void display2()
{
System.out.println("Student name:" +sname);
System.out.println("Address:" +address);
System.out.println("Rollno:" +rollno);
}}

class MOOC extends S1
{
String sub;
int dur;
void readMooc()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the subject:");
sub=sc.next();
System.out.println("Enter the Duration:");
dur=sc.nextInt();
}
void display3()
{
System.out.println("Subject:" +sub);
System.out.println("Duration:" +dur);
}}

class IMain
{
public static void main(String args[])
{
MOOC mooc=new MOOC();
mooc.get();
mooc.read();
mooc.readMooc();
mooc.display2();
}}

