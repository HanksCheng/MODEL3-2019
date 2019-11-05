import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	double n=scn.nextDouble();
	System.out.println((int)re(n));
    }
    public static double re(double n){
        if(n==0||n==1){
            return n+1;
        }else {
            return re(n-1)+re((Math.floor(n/2d)));
        }
    }
}
