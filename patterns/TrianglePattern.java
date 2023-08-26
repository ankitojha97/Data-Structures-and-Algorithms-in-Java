package patterns;
import java.util.Scanner;
public class TrianglePattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int limit = 1;
        for(int j = 0; j<n;j++){
            for( int i = 1 ; i<=limit;i++){

                System.out.print('*');
            
    
            }
            System.out.println();
            limit++;  
        }
       
        
        s.close();
    }
}
