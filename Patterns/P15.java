package patters;

public class P15 {
    public static void main( String[] args ){
        int n=4;
        for (int i=1;i<=n;i++){
            for (int k = 1; k <= (2 * i - 1); k++) {
                
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }  
            System.out.println();  
        }

    }
    
}
