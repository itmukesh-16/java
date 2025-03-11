import java.util.Scanner;

class swap{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int c=0;

        System.out.println("enter first number:");
        num1=sc.nextInt();

        System.out.println("enter first number:");
        num2=sc.nextInt();

        System.out.println(" Numbers before swap:"+num1+"---"+num2);

        c=num1;
        num1=num2;
        num2=c;

        System.out.println(" Numbers before swap:"+num1+"---"+num2);
    }
}