package Assignment_2;
import java.io.*;
import java.util.*;
public class SumPair {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        ArrayList l = new ArrayList();
        System.out.println("Enter the target sum ");
        int k = s.nextInt();
        System.out.println("Enter the size of arraylist: ");
        int size=s.nextInt();
        System.out.println("Input element: ");
        for(int i=1; i<=size ;i++){
            l.add(s.nextInt());
        }
        System.out.println(l);
        for(int i=0; i<l.size() ;i++){
            for(int j=i+1 ; j<l.size(); j++){
                int x= (int)l.get(i);
                int y= (int)l.get(j);
                if(x+y==k){
                    System.out.println("Pair :"+x+","+y);
                }
            }
        }
    }

}
