import java.util.*;
class poly
{
void get()
{
System.out.println("polymorphism");
}
void get(int x)
{
System.out.println("value of x"+x);}
void get(int x,int y)
{
int z;
z=x+y;
system.out.println("result is"+z);
}
public class pdemo
{
public static void main(String[]args)
{
poly p=new poly();
p.get();
p.get(5);
p.get(8,8);
}
}

