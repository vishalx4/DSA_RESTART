public class PrintSubsets {

    public static void main(String[] args) {
        String s = "abcd";
        printAllSubsets(s, "");
    }

    public static void printAllSubsets(String in, String out) {
        if (in.isEmpty()) {
            System.out.println(out);
            return;
        }
        char a = in.charAt(in.length()-1);
        in = in.substring(0, in.length()-1);
        printAllSubsets(in, out);
        printAllSubsets(in, out + a);
    }

}
