import java.util.Scanner;
class scannerclass{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Roll No:");
int rollno = sc.nextInt();
System.out.println("Enter Name : ");
sc.nextLine();
String name = sc.nextLine();
System.out.println("Enter Subject Marks:");
int sub1 = sc.nextInt();
int sub2 = sc.nextInt();
int sub3 = sc.nextInt();
int sub4 = sc.nextInt();
int sub5 = sc.nextInt();
double totalMarks=sub1+sub2+sub3+sub4+sub5;
double per = (totalMarks/500.0)*100.0;
System.out.println("\nStudent details are:");
System.out.println("Roll No:" + rollno);
System.out.println("Name :" + name);
System.out.println("Percentage : " + per);
}
}