import java.util.ArrayList;
import java.util.Collections;

public class poke01 {
    public static void main(String[] args) {
        ArrayList<Integer> poker = Shuffle();
        System.out.println(poker);
		int [][]Holdem = playerCard();
		for(int v[]:Holdem) {
			for(int vv:v) {
				System.out.println(vv);
			}
		}

    }

    static int[][] playerCard() {
        ArrayList<Integer> poker = Shuffle();
        System.out.println("------------");
//			for(int v:poker) {
//				System.out.println(v);		//檢查
//			}
        int players = 9;
        int[][] player = new int[players][2];
        for (int i = 0; i < players * 2; i++) {
            player[i % players][i / players] = poker.get(i);
        }
        String[] suits = {"♠", "♥", "♦", "♣"}; // 宣告必須給值 花色
        String[] values = new String[]{"A ", "2 ", "3 ", "4 ", "5 ", "6 ",
                "7 ", "8 ", "9 ", "10", "J ", "Q ", "K",};
        for (int[] v : player) {
            for (int card : v) {
				System.out.print(suits[card/13] + values[card%13]);

            }
            System.out.println("-----");
        }
        return player;

    }


    static ArrayList<Integer> Shuffle() {
        ArrayList<Integer> poker = new ArrayList<>();
        for (int i = 0; i < 52; i++) poker.add(i);
        Collections.shuffle(poker);
//			for (Integer v:poker) {
//			System.out.println(v);
//		}
        return poker;


    }
}