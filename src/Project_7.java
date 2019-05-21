public class Project_7 {
    public static void main(String[] args) {
        int count = 1;
        int possiblePrime = 3;
        while (count < 10001) {
            boolean notPrime = false;
            for (int i = 2; i < Math.sqrt(possiblePrime) + 1 && !notPrime; i++) {
                if (possiblePrime % i == 0) {
                    notPrime = true;
                    count--;
                }
            }
            count++;
            possiblePrime++;
        }
        possiblePrime--;
        System.out.println(possiblePrime);
    }
}