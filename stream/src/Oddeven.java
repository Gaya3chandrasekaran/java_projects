import java.util.Arrays;
import java.util.List;

public class Oddeven {
    public static void main(String[] args) {
        List<Integer> numlist= Arrays.asList(34,25,89,23,76,11,47,55,68);
        System.out.println("sum of odd numbers in (34,25,89,23,76,11,47,55,68): ");
        // displays odd values in list
        //numlist.stream().filter(n->n%2==1).sorted().forEach(n-> System.out.print(n+" "));
        int oddsum= numlist.stream().filter(n->n%2==1).sorted().reduce(0,(o,d)->o+d);
        System.out.println(oddsum);
        System.out.println("sum of even numbers in (34,25,89,23,76,11,47,55,68): ");
        //displays even values in list
       // numlist.stream().filter(n->n%2==0).sorted().forEach(n-> System.out.print(n+" "));

        int evensum = numlist.stream().filter(n->n%2==0).sorted().reduce(0,(e,v)->e+v);
        System.out.println(evensum);

    }
}
