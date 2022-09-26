public class FactorialPrime {
    public static void main(String[] args) {
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }

    static int isFactorialPrime(int number) {
        if(!isPrime(number))
            return 0;
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *=i;
            if(number == factorial + 1){
                return 1;
            }
       }
        return 0;
    }

    static boolean isPrime(int number){
        if(number <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(number);i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
