public class SystematicallyIncreasing {
    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
        System.out.println(isSystematicallyIncreasing(new int[]{1} ));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3} ));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3} ));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1} ));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));

    }

    static int isSystematicallyIncreasing(int [] array){
        if(array[0] != 1 || array[0] != 1 )
            return 0;
//        if(array[0] == 1 && array.length == 1)
//            return 1;
        int j = 1;
        int k = 0;
        while(k < array.length){
            for(int i = 1; i <= j; i++) {
                if(array[k] != i)
                    return 0;
                k++;
            }
            j++;
        }
        return 1;
    }
}
