import java.util.*;
public class Codeforces4A{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            int N  = scan.nextInt();
            if(N % 2 ==0  && N > 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}