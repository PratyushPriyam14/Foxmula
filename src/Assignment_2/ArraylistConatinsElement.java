package Assignment_2;

import java.util.*;
public class ArraylistConatinsElement {
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element to check it is Present or not : ");
        int element=s.nextInt();
        ArrayList<Integer> l= new ArrayList<>();
        System.out.println("Input element");
        while(s.hasNextInt()){
            l.add(s.nextInt());
        }
        System.out.println(l);
        if(l.contains(element)){
            System.out.println("True: "+element);
        }else{
            System.out.println("False: element is not present in arraylist");
        }
    }
}
