import java.util.*;
class Task1 {
    public static void main(String[] args) {
         System.out.println("Enter the starting number:");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println();
         System.out.println("Enter the ending number:");
         int b=in.nextInt();
        for(int i =a; i<b ; i++){
            if(i % 2 == 0){
                 System.out.println(i);
            }
            
        }
    }
}