import java.util.Arrays;

public class Reverses {
    public static void main(String[] args) {
        String string=new String("Hello world! good morning!");
        // breaking string into array
        Object[] strarr= Arrays.stream(string.split(" ")).toArray();
        System.out.println("Given Array: "+Arrays.toString(strarr));
        // creating a reversed array
        Object[] revarr= new Object[strarr.length];

        for (int i = 0; i <= strarr.length-1 ; i++) {
            StringBuilder o =new StringBuilder(strarr[i].toString());
            StringBuilder reverse=new StringBuilder();
            for (int j = o.length()-1; j >= 0; j--) {
                reverse.append(o.charAt(j));
                revarr[i]=reverse;
            }
        }
        System.out.println("reversed Array: "+Arrays.toString(revarr));
    }
}
