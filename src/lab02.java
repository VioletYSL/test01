public class lab02 {

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7,8,9,};

        String[] y=new String[x.length];
        for(int i=0;i<x.length;i++){
            y[i]=String.valueOf(x[i]);
        }
        System.out.println(y[5]+y[0]);

    }

}