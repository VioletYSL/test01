import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guessnum extends JFrame implements ActionListener {
    private JTextField input;
    private JButton guess;
    private JTextArea log;
    private String answer;

    public Guessnum(){
        super("猜數字遊戲");
        input = new JTextField();
        guess = new JButton("猜");
        log = new JTextArea();
        answer = createAnswer(3);

        setLayout(new BorderLayout());
        add(log,BorderLayout.CENTER);

        JPanel top = new JPanel(new BorderLayout());
        add(top,BorderLayout.NORTH);
        top.add(guess,BorderLayout.EAST);
        top.add(input,BorderLayout.CENTER);

        guess.addActionListener(this);

        setSize(800,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        newGame();
        intiMember();
    }
    private void intiMember(){
        Font font1 = new Font(null,Font.BOLD,24);
        input.setFont(font1);
        Font font2 = new Font(null,Font.PLAIN,18);
        log.setFont(font2);
        log.setEditable(false);
    }


    public static void main (String[] args){
    new Guessnum();

    }
    private void newGame() {
        answer = createAnswer(3);
        System.out.println(answer);
        log.setText("");
        counter = 0;
    }
    private int counter;
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("OK");
        String inputString = input.getText();

        input.setText("");
        if(isValidInput(inputString)){
            counter++;
            String result = CheckAB(inputString);
            log.append(String.format("%d . %s => %s\n",counter,inputString,result));
            if(result.equals("3A0B")){
                JOptionPane.showConfirmDialog(null,"恭喜老爺 賀喜夫人");
                newGame();
            }else if(counter==5){
                JOptionPane.showConfirmDialog(null,"你好爛 爛死了:"+answer);
                newGame();
            }
        }


    }
    private boolean isValidInput(String g){

        return true;
    }

    private String createAnswer(int d){
        int[] poker = new int[d];	// poker[第幾張] = 值 => 52 => 0
        boolean isRepeat;
        int rand;
        for (int i=0; i<poker.length; i++) {
            do {
                rand = (int)(Math.random()*10);	// rand 0 - 51

                // 檢查機制
                isRepeat = false;
                for (int j = 0; j < i; j++) {
                    if (poker[j] == rand) {
                        // 重複了
                        isRepeat = true;
                        break;
                    }
                }
            }while (isRepeat);

            poker[i] = rand;
            //System.out.println(poker[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<d;i++){
            sb =sb.append(poker[i]);
        }
//        System.out.println(sb);
        return sb.toString();
    }

    private String CheckAB(String inst) {
        int a = 0,b =0;
        for(int i =0;i<answer.length();i++){
            if(answer.charAt(i)==inst.charAt(i)){
                a++;
            }else if(answer.indexOf(inst.charAt(i))>=0){
                b++;
            }
        }
        return String.format("%dA%dB",a,b);
    }


}
