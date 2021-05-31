package Assignment_2;

import java.util.*;

public class TraverseTreeSet {
    public static void main(String []args){

        HashSet<Integer> s = new HashSet<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        System.out.println("Enter the Element");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            s.add(x);
        }
        for (Integer i : s)
            System.out.println(i);
    }

}
