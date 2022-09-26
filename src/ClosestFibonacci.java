import java.util.ArrayList;
import java.util.List;

public class ClosestFibonacci {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
    }

    static int closestFibonacci(int number){
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0,1);
        listFibonacci.add(1,1);
        for(int i = 0; i <= number; i++){
            int sum = listFibonacci.get(i) + listFibonacci.get(i+1);
            listFibonacci.add(sum);
            if(sum == number)
                return sum;
            if(sum > number)
                return listFibonacci.get(i+1);
        }
        if(number < 1)
            return 0;
        return 1;
    }
}
