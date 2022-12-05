import java.util.Scanner;
public class eo {
    public static void main(String[] args) {
        
        int num;
        System.out.println("Enter Any Number:-");

        Scanner s=new Scanner(System.in);

        num = s.nextInt();
        while(num>=0)
        {
            if(num%2==0){
                System.out.println("EVEN NUMBER\n");
                break;
            }
            else{
                System.out.println("Odd Number");
                break;
            }
            
        }
        System.out.println("While Loop Ended");
    }
}
