public class Project_5 {
    public static void main(String[] args) {
        int count = 1;
        boolean found = false;
        while(!found) {
            int i = 0;
            for (int j = 1; j <= 20; j++) {
                if (count % j == 0) {
                    i++;
                }
            }
            if (i == 20) {
                found = true;
            }
            count++;
        }
        count--;
        System.out.println(count);
    }
}