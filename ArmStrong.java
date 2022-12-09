import java.util.Scanner;
public class Armstrong
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number : "); 
 int num = sc.nextInt(); 
 int copy = num;
 int result=0;
 int n=0;
 int rem;
 while (num != 0)
 {
 num /= 10;
 n++;
 }
 num = copy; 
 while (num != 0) 
 {
 rem = num%10;
 int mul=1;
 for(int i=1;i<=n;i++) {
 mul=mul*rem; 
 } 
 result=result+mul;
 num /= 10; 
 }
 if(result==copy)
System.out.println("Armstrong Number");
 else
 System.out.println("Not Armstrong number");
}
}