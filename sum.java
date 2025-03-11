import java.util.Scanner;

class sum{

    public static void main(String args[]){

        int num1=0;
        int num2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enteer two numbers:");
        
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println ("the sum of two number is :"+(num1+num2));
    }
}