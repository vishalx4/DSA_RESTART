public class NBitBinaryNumber {
    
    public static void main(String[] args) {
        generateNBitBinaryNumber(4, "");
    }

    public static void generateNBitBinaryNumber(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        if (s.isEmpty()) {
            generateNBitBinaryNumber(n-1, s + "1");
        } else {
            generateNBitBinaryNumber(n-1, s + "0");
            generateNBitBinaryNumber(n-1, s + "1");
        }
    }
}
