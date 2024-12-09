import java.util.*;
 public class postfix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int post[]=new int[n];
        post[0]=arr[n-1];
        for(int i=1;i<n;i++)
        {
           post[i]=arr[n-(i+1)]+post[i-1];
        }
          System.out.println(Arrays.toString(post));
    }
    
}