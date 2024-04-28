public class BalancedParenthesis {
    public static void main(String[] args) {
        generateBalanceParenthesis(3, 3, "");
    }

    public static void generateBalanceParenthesis(int o, int c, String s) {
        if (o == 0 && c == 0) {
            System.out.println(s);
            return;
        }

        if (o == c) {
            generateBalanceParenthesis(o-1, c, s + "(");
        } else {
            if (o != 0) {
                generateBalanceParenthesis(o-1, c, s + "(");
            }
            if (c != 0) {
                generateBalanceParenthesis(o, c-1, s + ")");
            }
        }
    }
}








