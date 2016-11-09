import.java.util.*;
class calc
{public static voiid main (String[]args)
int a,b,c;
int ch;
System.out.println(''Enter your choice");
Scanner S = new Scanner(system.in);
ch =s.nextInt();
system.out.println("Menu 1.Add 2. Subtract 3. Multiply 4. Modulus 5. division");
switch(ch)
{
case 1:
System.out.println("enter the value of a & b");
a=s.nextInt();
b=s.nextInt();
c=a+b;
system.out.println("the result is "+c);
break;

case 2:
System.out.println("enter the value of a & b");
a=s.nextInt();
b=s.nextInt();
c=a-b;
system.out.println("the result is "+c);
break;

case 3:
System.out.println("enter the value of a & b");
a=s.nextInt();
b=s.nextInt();
c=a*b;
system.out.println("the result is "+c);
break;

case 4:
System.out.println("enter the value of a & b");
a=s.nextInt();
b=s.nextInt();
c=a%b;
system.out.println("the result is "+c);
break;

case 5:
System.out.println("enter the value of a & b");
a=s.nextInt();
b=s.nextInt();
c=a/b;
system.out.println("the result is "+c);
break;

default:
system.out.println("Enter the choice correctly");
break;
}
}
}



