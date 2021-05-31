package Foxmula_Assignment2;

import java.util.*;
public class OccurancceInArrayList {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        System.out.println("Enter element ");
        while(s.hasNextInt()){
            l.add(s.nextInt());
        }
        System.out.println(l);
        HashMap<Integer , Integer>hm=new HashMap<>();
        for(int val: l) {
            if (hm.containsKey(val)) {
                int of = hm.get(val);
                int nf = of + 1;
                hm.put(val, nf);
            }else{
                hm.put(val,1);
            }
        }
        System.out.println(hm);
    }

}
