public class WrapperExample{
public static void main(String[] args){
//autoboxing
int a = 20;
Integer i = Integer.valueOf(a);
Integer j = a;
System.out.println(a+" "+i+" "+j);
//unboxing
Integer b = new Integer(3);
int x = b.intValue();
int y = b;
System.out.println(b+" "+x+" "+y);
}
}