import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w=sc.next();


        int lgth=w.length();
        int halflgth=lgth/2;
        boolean b1=true;
        for (int i=0; i<halflgth;i++){
            char a=w.charAt(i), b=w.charAt(lgth-1-i);
            if (a!=b){
                b1=false;
                break;
            }
        }
        System.out.println(b1? "TRUE" : "FALSE");
    }
}