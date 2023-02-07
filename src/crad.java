import java.util.ArrayList;
import java.util.Collections;

public class crad {

    public static void main(String[] args){
        String[] poker = Shuffle();


        int players = 9;
//        String [][]player =new String[players][2];
//        for (int i = 0; i < players * 2; i++) {
//            player[i % players][i / players] = pokerStr.get(i);
//        }

    }
    static String[] Shuffle() {
        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < 52; i++) poker.add(String.valueOf(i));
        Collections.shuffle(poker);
//			for (Integer v:poker) {
//			System.out.println(v);
//		}
        int sum =0;
        String[] suits = {"♠", "♥", "♦", "♣"}; // 宣告必須給值 花色
        String[] values = new String[]{"A ", "2 ", "3 ", "4 ", "5 ", "6 ",
                "7 ", "8 ", "9 ", "10", "J ", "Q ", "K",};
        String[] pokerStr = new String[poker.toArray().length];

        for (int card =0;card<52;card++) {
            pokerStr[card] =  suits[card/13] + values[card%13];
            System.out.print(suits[card/13] + values[card%13]);
            sum = sum+1;



        }
        System.out.println("sum ="+sum);
        return pokerStr;
    }

}
