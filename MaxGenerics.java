package MaximumGenerics;
import java.util.ArrayList;

public class MaxGenerics {
    public static int findMax(int a, int b, int c) {
        Integer A = new Integer(a);
        Integer B = new Integer(b);
        Integer C = new Integer(c);
        if (A.compareTo(B) >= 0 && A.compareTo(C) >= 0) {
            return a;
        } else if (B.compareTo(A) >= 0 && B.compareTo(C) >= 0) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
    System.out.println(findMax(30, 20, 10)); // 30
    System.out.println(findMax(20, 30, 10)); // 30
    System.out.println(findMax(10, 20, 30)); // 30
}
}
