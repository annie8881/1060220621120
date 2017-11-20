import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        for(int i=2;i<=100;i++)
        {
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
