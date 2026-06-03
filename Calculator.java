import java.util.*;
public class Calculator{
    public static void main(String[] args){
         Scanner Sc = new Scanner(System.in);
         System.out.println("Enter value of a ");
         System.out.println("Enter value of b ");
         System.out.println("Enter operation You want to perform:\n 1.Addtion\n 2.sub\n 3.Mutil\n 4.divide\n 5.Modulus");
         int a = Sc.nextInt();
         int b = Sc.nextInt();
         int operator = Sc.nextInt();
         System.out.println("value of a:"+ a);
         System.out.println("value of b:"+ b);
         switch (operator){
            case 1 : System.out.print(a+b);
            break;
            case 2 : System.out.print(a-b);
            break ;
            case 3 : System.out.print(a*b);
            break;
            case 4 : if(b==0){
                System.out.println("Invalid Input value of b :");
            }else{
                System.out.println(a/b);
            }
            case 5 : if(b==0){
                System.out.print("invalid Input value of b.");
            }else{
                System.out.print(a%b);
            }

            
         }
    }
}