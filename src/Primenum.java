public class Primenum {
    public static void main (String[] args){
        int a=100;  //set最大值
        int sum =0;
        for(int i=2;i<=a;i++){
            boolean prime = true;
                for(int j = 2;j<i;j++){
                    if(i%j==0){
                    prime =false;
                    break;
                    }


                }
            if (prime==true ){
                System.out.print(i+" ");
                sum = sum+1;
            }

        }
        System.out.println("sum ="+ sum);

        }

}

