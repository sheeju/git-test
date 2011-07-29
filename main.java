import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Date;
import java.lang.Thread;


class A
{
  private int i;

  public A(int i)
  {
    this.i = i;
  }

  public A(A a)
  {
    this.i = a.i;
  }

  public int i()
  {
    return i;
  }
}

class Main
{
  public static void main(String args[]) throws InterruptedException
  {
    System.out.println("Testing classes");

    A o = new A(3);
    A otherO = new A(o);
    
    System.out.println("otherO.i(): " + otherO.i()); 

    System.out.println("Testing Lists and Iterators");
    
    Date a = new Date();
    // Thread.sleep(1000);
    Date b = new Date();
    // Thread.sleep(1000);
    Date c  = new Date();

    List<Date> list = new ArrayList<Date>();
    list.add(c);
    list.add(a);
    list.add(b);

    Collections.sort(list);

    Iterator<Date> i = list.iterator();
  
    while(i.hasNext())
    {
      System.out.println("\n" + i.next());
    }
 
    System.out.println("Testing Date");
    
    System.out.println("a.getTime: " + a.getTime()); 
    System.out.println("a compared to b: " + a.compareTo(b));

    System.out.println("Testing Integer");
 
    System.out.println("a compared to b" + (new Integer(1)).compareTo(new Integer(2))); 
    
    System.out.println("Testing String");

    String s = "Hey I am a 3, 3";
    
    System.out.println("Replace: " + s.replaceAll("3", "Dude"));
  }
}
