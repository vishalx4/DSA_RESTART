import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsWithSpaces {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        permutationsWithSpaces("abc", "", s);
        System.out.println(s);
    }

    public static void permutationsWithSpaces(String in, String out, ArrayList<String> ans) {
        if (in.length() == 1) {
            ans.add(out + in);
            return;
        }
        char c = in.charAt(0);
        in = in.substring(1);
        char space = ' ';
        permutationsWithSpaces(in, out + c + space, ans);
        permutationsWithSpaces(in, out + c, ans);
    }
}
