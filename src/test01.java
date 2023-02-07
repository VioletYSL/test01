public class test01 {
    public static void main(String[] args) {
        int p =6;
        int a[][] = new int[p][2];
        int c[] = {9,6,3,8,5,2,7,4,1,0,10,12,18,16,11,19,20,15,17,13};
        for(int i =0;i<p*2;i++){
            a[i%p][i/p]=c[i];
        }
        for(int[] v:a) {
            for(int vv :v) {
                System.out.print(vv+" ");
            }
            System.out.println("------");
        }

    }
}
