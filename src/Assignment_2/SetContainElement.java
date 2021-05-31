package Assignment_2;

import java.util.*;
public class SetContainElement {
    public static void main(String []args)
    {
     Scanner s= new Scanner(System.in);
     System.out.println("Enter the element ");
     int element=s.nextInt();
     Set<Integer> hs=new HashSet<>();
     System.out.println("Input element");
     while (s.hasNextInt()) {
         hs.add(s.nextInt());
     }
     System.out.println(hs); //duplicates are not allowed
     System.out.println("Does set contains element : " +hs.contains(element));
    }
}
