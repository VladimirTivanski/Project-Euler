import javax.swing.JOptionPane;

public class Project_3 {
    public static void main(String[] args) {
        long num = Long.parseLong(JOptionPane.showInputDialog("Enter Num"));
        long i;
        long largestPrimeFactor = 0;
        for (i = 3; i < Math.sqrt(num) + 1; i += 2) {
            if (num % i == 0) {
                boolean check = true;
                for (int j = 3; j < Math.sqrt(i) + 1 && check; j += 2) {
                    if (i % j == 0) {
                        check = false;
                    }
                }
                if (check) {
                    largestPrimeFactor = i;
                }
            }
        }
        System.out.println(largestPrimeFactor);
    }
}