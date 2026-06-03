package patters;

public class P5 {
    public static void main( String[] args){
        int n= 4;
        int j;
         for (int i= n;i>=0;i--){
              for( j=0;j<i;j++){
                 System.out.print(" ");
                   } 
              for (j=0;j<n-i+1;j++){
                 System.out.print("*");
                 }
               System.out.println();
             }
        

         
    
    }
}
