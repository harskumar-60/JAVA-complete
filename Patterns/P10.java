package patters;

public class P10 {
    public static void main(String[] args){
        int n=5;
        //uperr part
         for (int i= 1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");   
            }
            for (int k=0; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
       
         //lower  part
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");   
            }
            for (int k=0; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
    
}
