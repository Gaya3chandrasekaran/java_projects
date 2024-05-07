public class Palindrome {
    public static void main(String[] args) {
        String string = new String("gayathri");
        string.toLowerCase();
        int count=0;
        StringBuilder reverse = new StringBuilder();
        for (int i = string.length()-1; i >=0 ; i--) {
            reverse.append(string.charAt(i));
        }
        for (int j = 0; j <=string.length()-1 ; j++) {
            if(string.charAt(j)==reverse.charAt(j)){
                count++;
            }
        }
        if (count==string.length()){
            System.out.println("The given string "+ string+" is a Palindrome");
        }else {
            System.out.println("The given string "+ string+" is not a Palindrome");
        }
    }
}
