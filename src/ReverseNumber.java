public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(54321));

    }

    static int reverseNumber(int number) {
        int result = 0;
        int newNum = number;
        if(number < 0) newNum *= -1;
        while (newNum > 0) {
            int lastDigit = newNum % 10;
            result = result * 10 + lastDigit;
            newNum /= 10;
        }
        if (number < 0)
            return -result;
        return result;

    }
}
