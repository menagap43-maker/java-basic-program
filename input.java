// Reversal of string

/*import java.util.Scanner;
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

}*/

// fibonacci series

/*import java.util.Scanner;
public class input {
    public static void main(String args[]){
        int first=0,second=1,next,i,number;
        System.out.println("enter the number of terms:");
        Scanner scan =new Scanner(System.in);
        number=scan.nextInt();
        for(i=0;i<number;i++){
            if(i<=1){
                next=i;
            }
            else{
                next=first+second;
                first=second;
                second=next;
            }
            System.out.print(" "+next);
        }

    }
    
}*/

//factorial

import java.util.Scanner;
public class input{
    public static void main(String args[]){
        int f=1,i,n;
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        for( i=1;i<n+1;i++){
            f=f*i;
    }
    System.out.println("the factorial number " + f);
}
    }


