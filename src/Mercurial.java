public class Mercurial {
    public static void main(String[] args) {

        System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 1, 2, 2} ));
        System.out.println(isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2, 2} ));
        System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 16, 2, 2} ));
        System.out.println(isMercurial(new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}));
        System.out.println(isMercurial(new int[]{2, 3, 1, 1, 18}));
        System.out.println(isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
        System.out.println(isMercurial(new int[]{3, 3, 3, 3, 3, 3}));
        System.out.println(isMercurial(new int[]{1}));
        System.out.println(isMercurial(new int[]{}));
    }

    static int isMercurial(int[] array) {
        int first1 = 0;
        int second1 = 0;
        int first3 = 0;
        boolean flag = true;
        if (array.length <= 2)
            return 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 && flag) {
                first1 = i;
                flag = false;
            } else if (array[i] == 1 && !flag) {
                second1 = i;
            }

        }
        for (int i = first1; i < second1; i++) {
            if (array[i] == 3)
                return 0;
        }
        return 1;
    }
}
