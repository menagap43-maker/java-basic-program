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

/*import java.util.Scanner;
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
    }*/

//palindrom

/*import java.util.Scanner;
public class input{
    public static void main(String args[]){
    int r,n,reverse=0,a;
    System.out.println("enter the number");
    Scanner scan =new Scanner(System.in);
    n=scan.nextInt();
    a=n;
    while(n>0){
        r=n%10;
        reverse=reverse*10+r;
        n=n/10;
  }
  if(a==reverse){
    System.out.println("it is a palindrom number");
  }
  else{
    System.out.println("it is  not palindrom number");
  }
}
}*/

//prime number

import java.util.Scanner;
public class input{
    public static void main(String args[]){
        int i,a=0,n;
        System.out.println("enter the number");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=2;i<=n-1;i++) {
            if(n%2==0) {
                a=a+1;
            } }
        if(a>0) {
            System.out.println("no is not prime number");
        }
        else{
            System.out.println("is a prime number");
        }
    }
}
