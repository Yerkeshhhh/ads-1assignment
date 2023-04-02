public class Problem8 {
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char c = s.charAt(0);
        if (Character.isDigit(c)) {
            return isAllDigits(s.substring(1));
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123a12";
        boolean result1 = isAllDigits(s1);
        boolean result2 = isAllDigits(s2);
        System.out.println(result1 ? "Yes" : "No");
        System.out.println(result2 ? "Yes" : "No");
    }
}