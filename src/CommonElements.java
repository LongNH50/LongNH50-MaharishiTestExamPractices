public class CommonElements {
    public static void main(String[] args) {
        int[] first = {1, 8, 3, 2, 6};
        int[] second = {2, 6, 1};
        int[] result = commonArray(first, second);
        for (Integer i : result) {
            if (i != 0) {

                System.out.print(i + " ");
            }
        }
//        System.out.println(commonArray(new int[]{1, 8, 3, 2, 6},new int[]{2, 6, 1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));
//        System.out.println(commonArray(new int[]{1,8,3,2},new int[]{4,2,6,1}));

    }

    static int[] commonArray(int[] first, int[] second) {
        if (first.length == 0 || second.length == 0)
            return null;
        int[] result = new int[first.length];
        int index = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    result[index++] = first[i];
                }
            }
        }
        return result;

    }
}
