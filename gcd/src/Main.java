import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();
        int q=x*y*z;
        q=q/gcd(x,y,z);
        System.out.println(q);
    }
    public static int gcd(int x,int y){
        if (y==0){
            return x;
        }else {
            return gcd(y,x%y);
        }
    }
    public static int gcd(int x,int y, int z){
        return gcd(gcd(x,y),z);
    }
}