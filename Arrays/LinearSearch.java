package Arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        boolean isFound=false;
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                isFound=true;
                break;
            }
        }
        System.out.println(isFound);
        

        
    }
    
}
