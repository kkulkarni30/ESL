class Abc
{
int a,b;
Abc()
{
a=8;
System.out.println("this is default constructor");
}
Abc(int x,int y)
{
b=9;
System.out.println("this is parameterized constructor");
}
public static void main(String[] args)
{
Abc obj1 = new Abc();
Abc obj2 = new Abc();
System.out.println(obj1.a);
System.out.println(obj2.b);
}
}