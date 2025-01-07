import java.util.*;
class Division{
public static void main(String args[]){
   System.out.println("Enter two integer to Divide");
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();  
if(b==0){
System.out.println("Invalid Division");
     
}
else{
   System.out.println("Division : "+ (a/b));
}
}
}