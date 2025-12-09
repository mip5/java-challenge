import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ener the number of players (N) and numer of matches (M): ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println("Enter the points for each of the "+N+" players: ");
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sc.nextLong();
        }

        long T = (42L * M - sum) / 22L;
        System.out.println("Number of ties: " +T);
    }
}
