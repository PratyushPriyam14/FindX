import java.io.*;
import java.util.*;
public class FindX{
  public static void main(String []args){
    Scanner s=new Scanner(System.in);
    int count=0;
    int n=s.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int x=s.nextInt();
    int k=s.nextInt();
    //logic  we will incerease the count only when there is x present inside the loop of range (k).other wise we will break and no will be printed
    //so at last we will see whether the count is equal to k if it is means x is present in every segement of k so print yes then.
    for(int i=0;i<n/k;i++){  //loop for incerse count 
      for(int j=0;j<k%arr.length;j++){  //this loop for finding the x 
        if(arr[j]==x){
        count++;
        break;
        }
      }
     }
    System.out.println(count);
    if(count==n/k){
     System.out.println("yes"); 
    }
    else{
      System.out.println("no");
    }
  }
}
