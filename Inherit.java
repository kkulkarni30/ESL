class Parent
{
int a=5;
void show()
{
System.out.println("Parent");
}
}
class Child extends Parent
{
int b=10;
void show()
{
System.out.println("Child");
}
}
class Main
{
public static void main(String[] args)
{
Parent p = new Parent();
p.show();
Child c = new Child();
c.show();
System.out.println(c.a);
System.out.println(c.b);
}
}