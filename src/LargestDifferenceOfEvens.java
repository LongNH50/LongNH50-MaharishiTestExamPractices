public class LargestDifferenceOfEvens {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }

    static int largestDifferenceOfEvens(int[] array) {
        int max = array[0];
        int min = 2;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
                if (array[i] > max) {
                    max = array[i];
                } else if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        if (count > 1) {
            return max - min;

        }
        return -1;
    }
}
