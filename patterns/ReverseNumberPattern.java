package patterns;
import java.util.Scanner;
public class ReverseNumberPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int outer = 1;outer<=n;outer++){
            for(int inner = outer; inner>=1;inner --){
                System.out.print(inner);
            }
            System.out.println();

        }
        s.close();
    }
}
