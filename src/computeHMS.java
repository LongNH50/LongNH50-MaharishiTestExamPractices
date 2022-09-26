public class computeHMS {
    public static void main(String[] args) {
       int[] array = computeHMS(55);
       for(int i = 0; i< array.length;i++){
           System.out.println(array[i]);
       }

    }

    static int[] computeHMS(int seconds){
        int [] array = new int[3];
        array[0] = seconds / 3600;
        array[1] = (seconds - (array[0] * 3600)) / 60 ;
        array[2] = (seconds - (array[0] * 3600) - (array[1] * 60));
        return array;
    }
}
