import java.util.*;
public class Main {
    //英哩轉公里
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int x;          //英哩
     double y;
     double Z=1.6;
     x=in.nextInt();
     y=x*Z;
     System.out.printf("%.1f\n",y);
    }
}
