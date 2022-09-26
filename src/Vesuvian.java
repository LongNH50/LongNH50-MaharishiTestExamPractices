public class Vesuvian {
    public static void main(String[] args) {
        System.out.println(isVersuvian(789));

    }

    static int isVersuvian(int number) {
        int count = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= Math.sqrt(number); i++) {
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == number) {
                    if (i != num2) {
                        count++;
//                        System.out.println(i + " " + j);
                    }
                    num1 = i;
                    num2 = j;

                }
                if (count == 2)
                    return 1;
            }
        }
        return 0;
    }
}
