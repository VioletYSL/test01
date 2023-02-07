import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class finaltest8 {
    static List<Integer> arr2 = new ArrayList<>();
    static List<Integer> arr3 = new ArrayList<>();
    public static void  main(String[] args){
        int []arr =new int[4];

        Scanner sc = new Scanner(System.in);
        System.out.println("input:");

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        minfac(arr);
        ckeckfac(arr2,arr);
        System.out.println(arr3.toString());
    }
    public static void minfac(int[]arr){
        int a = arr[0];
        for(Integer i =1;i<a;i++){
            if(a%i == 0){
                arr2.add(i);
            }
        }
//        System.out.println(arr2.toString());
    }
    public static void ckeckfac(List<Integer> arr2,int[] arr){
        for(Integer v: arr2){
            if(arr[1] % v  == 0 && arr[2] % v ==0 && arr[3] % v ==0 ){
                arr3.add(v);
            }
        }
    }
}
