public class HodderNumber {
    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));

    }

    static int isHodder(int n) {
        if(isPrime(n)){
            for(int i = 0; i <= n;i++){
                if(Math.pow(2,i) - 1 == n)
                    return 1;
            }
        }
        return 0;

    }

    static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
