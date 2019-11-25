import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int data[]=new int[b];
        int datasum[]=new int[b],tmp;
        for (int i=0;i<data.length;i++){
            data[i]=scn.nextInt();
        }

        for (int i=0;i<data.length;i++){
            tmp=data[i];
            while (tmp!=0){
                datasum[i]+=tmp%10;
                tmp=tmp/10;
            }
        }


        for (int i=0;i<data.length;i++){
            for (int j=i+1;j<b;j++){
                if (datasum[i]>datasum[j]){
                    tmp=datasum[j];
                    datasum[j]=datasum[i];
                    datasum[i]=tmp;
                    tmp=data[j];
                    data[j]=data[i];
                    data[i]=tmp;

                }
            }
        }
        for (int k=0;k<data.length;k++){
            System.out.print(data[k]+" ");
        }
    }
}
