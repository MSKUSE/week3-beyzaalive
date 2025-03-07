public class FindPrimes {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        for (int i = 0; 1 <= number; i++) {
            boolean isPrime = true;
            for (int j = 0; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
