package powerpackage;

public class PowerFinder {
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i<exponent; i++) {
            result *= number;
        }
        return result;
    }
}
