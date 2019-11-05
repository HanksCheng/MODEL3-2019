
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int newdata[]=fun();
        for (int i=0;i<newdata.length;i++){
            System.out.print(newdata[i]+"\t");
        }
    }
    public static int[] fun(){
        Scanner scn=new Scanner(System.in);
        long seed=scn.nextLong();
        int data[]=new int[6];
        Random rnd=new Random();
        rnd.setSeed(seed);
        int j=0;
        boolean flag=true;
        while (j<6){
            data[j]=rnd.nextInt(42)+1;
            flag=true;
            for (int k=0;k<j;k++){
                if (data[j]==data[k]){
                    flag=false;
                }
            }
            if (flag==true){
                j++;
            }
        }
        return data;
    }
}