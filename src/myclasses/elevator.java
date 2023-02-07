package myclasses;

import java.util.ArrayList;

public class elevator {
//    電梯有最高層和最低層，輸入數字選擇正確樓層數
//    輸入數字大於當前樓層，則為上行；小於當前樓層，則為下行
//    每次輸入數字的時候，需要對同為上行的數字或者同為下行的數字，進行排序
//    所輸入的目標樓層用集合存放，迴圈最低層到最高層，如果當前層在集合中存在，顯示開門，若還有目標樓層，則關門，繼續到下一目標樓層。
//    當選擇一個目標樓層，會生成隨機重量記錄在目標樓層，上行用原來重量加上目標樓層重量，下行則用原來重量減去目標樓層重量

    ArrayList<Integer> upFloorList = new ArrayList<Integer>();  //上樓
    ArrayList<Integer> downFloorList = new ArrayList<Integer>();//下樓
    private int nowFloor = 1;  // 當前層
    private  int topFloor ; //最高樓
    private  int bottomFloor ; //最低樓
    public int input;
    public elevator(){
        System.out.println("elevator()");
    }
    public void nowFloor(){
        System.out.println(nowFloor);

    }
    public void up(){
        if(input == 3) {
            System.out.println("7414");
        }else{

        }
    }
    public void down(){
        if(input == 1){
            System.out.println("7414");
        }else{

        }

    }
    public void callEle(){


    }
}
