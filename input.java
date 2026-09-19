import java.util.Scanner;
public class input{
    public static void main(String args []){
    String s;
    System.out.println("enter a string to repeat:");
    Scanner scan=new Scanner(System.in);
    s= scan.nextLine();
    int len = s.length();
    String rev="";
    for(int i=len-1;i>=0;i--){
        rev=rev+s.charAt(i);

    }
    System.out.print(rev);


        
    }

}