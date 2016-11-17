import java.util.*;
class remove{
public static void main(String[]args){
ArrayList<String>al=new ArrayList<String>();
al.add("Sai");
al.add("manoj");
al.add("Ajay");
al.add("Vijay");
ArrayList<String>al2=new ArrayList<String>();
al2.add("manoj");
al2.add("Ajay");
al.removeAll(al2);
Iterator itr=al.iterator();
while(itr.hasNext())
{System.out.println(itr.next());
}
}
}