import java.util.*; 

class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        double totalGPA = 0;

        for (int i = 0; i < n; i++) {
            double y1 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double y4 = sc.nextDouble();
            double studentGPA = (y1 + y2 + y3 + y4) / 4.0;
            totalGPA += studentGPA;
        }
        double averageGPA = totalGPA / n;
        if (averageGPA >= 8.5) {
            System.out.println("A");
        } else if (averageGPA >= 7.0) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
