import java.util.Scanner;

    public class finaltest {

        public static void main(String[] args) {
            int d;
            Scanner sc = new Scanner(System.in) ;
            System.out.print("請輸入數值a:");
            int a = sc.nextInt();
            System.out.print("請輸入數值b:");
            int b =sc.nextInt();
//		factor(a, b);  a,b因數
//		findN(a,b);		找n
//        bown(a,b);
        }

        public static void factor(int a,int b) {		//a,b因數的方法
            int c=0; int count = 0 ;
            if(a==b) {
                System.out.println("請輸入不同的數值");;
            }else if(a > b) {
                c = a;
            }else {c = b;}

            for(int i = 2;i < c; i++ ) {
                if(a%i == 0 & b%i == 0 ) {
                    count++;
                    System.out.print(i +" ");
                }
            }
            if(count == 0) {
                System.out.println("-1");
            }
            System.out.println("");
        }
        public static void findN(int a,int b) {		//找n的方法

            if(b%a == 0) {
                System.out.printf("n=%d",b/a);
            }else {
                System.out.println("-1");
            }
        }
        public static void bown(int a,int b){          // 找a^n =b的方法
            int n = 1;

            if(a > b){
                System.out.println("b值必須大於a值");
            }else if(a == b){
                System.out.println("1");
            }
            else {
                while((a*a) <= b){
                    if(b%a == 0){
                        n+= 1;
                    }
                    b= b/a;
                }
                if(a==b){
                    System.out.println(n);
                }else{
                    System.out.println("-1");
                }
            }
        }
    }


