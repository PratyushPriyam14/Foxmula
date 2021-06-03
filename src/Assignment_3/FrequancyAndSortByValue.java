package Assignment_3;
import java.util.*;
public class FrequancyAndSortByValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Enter element of List : ");
        while (s.hasNextInt()) {
            l.add(s.nextInt());
        }
        System.out.println(l);//printed the list
        System.out.println(valuebasedSort(l));
    }

    public static List<Integer> valuebasedSort(List<Integer> li) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : li) {
            if (hm.containsKey(val)) {
                int old = hm.get(val);
                int nf = old + 1;
                hm.put(val, nf);
            } else {
                hm.put(val, 1);
            }
        }
        System.out.println("Before sorting values  the frequency is: ");
        System.out.println(hm);
        System.out.println("After Sorting on the basis of value the list will be ");
        //After sorting
        Collections.sort(li, (n1, n2) -> { //passes list and element of list
            int fre1 = hm.get(n1);  //calculated the frequency of element 1
            int fre2 = hm.get(n2); //calculated the frequency of element 2

            if (fre1 != fre2) {  //if frequency are not same
                return fre2 - fre1;  //sort the value based on fre2- fre1 means the values whose frequency is more will come first
            }
            return n1 - n2; //if frequency is equal then sort on the values i.e 20=2 , 30=2 then 20 will come  first then 30.
        });
        return li;
    }
}
