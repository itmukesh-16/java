import java.util.Scanner;

class sub{


    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        int num1=0,num2=0,res=0;

        System.out.println("enter first number :");
        num1=sc.nextInt();

        System.out.println("enter second number :");
        num2=sc.nextInt();

        res=num1-num2;

        System.out.println(num1+" - "+num2 +" = "+res);



    }
}