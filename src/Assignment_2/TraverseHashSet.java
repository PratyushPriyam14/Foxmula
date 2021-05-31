package Foxmula_Assignment2;

import java.util.*;
public class TraverseHashSet {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<>();
        System.out.println("Input element ");
        while(s.hasNextInt()){
            h.add(s.nextInt());
        }
        //Displaying Element and duplicates are not allowed
        Iterator<Integer> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        }
}
