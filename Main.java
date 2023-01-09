//ABSTRACT
abstract class Vehicle
{
int noOfTyres;
abstract void start();
}
class Car extends Vehicle
{
void start()
{
noOfTyres=4;
System.out.println("starts with key");
}
}
class Bike extends Vehicle
{
void start()
{
noOfTyres=2;
System.out.println("Starts with kick");
}
}
class Main
{
public static void main(String[] args)
{
Car c = new Car();
c.start();
System.out.println(c.noOfTyres);
Bike b = new Bike();
b.start();
System.out.println(b.noOfTyres);
}
}