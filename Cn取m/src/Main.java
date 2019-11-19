import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt(), n=scn.nextInt();
        System.out.println(fun(m)/(fun(n)*fun(m-n)));
    }
    public static int fun(int x){
        int sum=1;
        for (int i=x;i>1;i--){
            sum*=i;
        }
        return sum;
    }
}