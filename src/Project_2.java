public class Project_2 {
    public static void main(String[] args) {
        int num = 1;
        int nextNum = 2;
        int sum = 0;
        while (num < 4000000) {
            nextNum += num;
            num = nextNum - num;
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}