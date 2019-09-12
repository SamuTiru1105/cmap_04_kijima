    package com.company;



//        for (int i =0; i < 5; i++)

    import java.io.*;
    import java.util.Random;

    public class homeworkday1 {

        static int watasiHp = 100;
        static int slimeHp = 100;
        public static void main(String[] args) {
            // TODO: ここ理解して書く
            // 型名 変数名 = XXX; 右辺を左辺に代入
            int[] history = new int[10]; //{1, 1, 1}
            int count = 0;
            try {
                System.out.println("[スライムと戦うゲーム]");
                System.out.println("--私のHP：" + watasiHp + " --");
                System.out.println("--スライムのHP：" + slimeHp + " --");

            boolean flag = true;
            while (flag) {


                 System.out.println("\nどうする？ 1：戦う 2：逃げる");
                 System.out.print("コマンドを数字で入力→ ");

                //攻撃の選択(配列の追加についてうまくいかない)
//              String attack="あなたはスライムを攻撃しますか？";
//                System.out.println(attack1);
////                //攻撃の選択肢
//                String[] attack=new String[3];
//                attack[0]="攻撃する";
//                attack[1]="防御する";
//                attack[2]="何もしない";
//                for(int i = 0; i<attack.length; i++){
//                    System.out.printf(attack[i]);
//                }
//                System.out.println("");
//
//                //攻撃入力欄
//                Scanner scanner1=new Scanner(System.in);
//                int input1= scanner1.nextInt();



                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String str = br.readLine();
                int choice = Integer.parseInt(str);
                // TODO: ここ理解して書く
                history[count] = choice;
                switch (choice) {
                    case 1:
                        System.out.println("\n私は戦うことを選んだ！");
                        Random random = new Random();
                        int critical = random.nextInt(4);
                        System.out.println("\n私の攻撃！！");
                        if (critical == 1) {
                            System.out.println("\n私は会心の一撃をはなった！！");
                            slimeHp -= 20;
                            System.out.println("\nスライムに20のダメージを与えた！");
                        } else {
                            slimeHp -= 5;
                            System.out.println("\nスライムに5のダメージを与えた！");
                        }
                        String status = "スライムは";
                        status += slimeHp >= 80 ? "不気味に笑っている"
                                : slimeHp >= 60 ? "まだ余裕の表情だ"
                                : slimeHp >= 40 ? "動きが鈍くなってきた"
                                : slimeHp >= 20 ? "何とか踏みとどまっている"
                                : slimeHp > 0 ? "今にも倒れそうだ"
                                : "ちから尽きた";
                        System.out.println(status);
                        if (slimeHp <= 0) {
                            System.out.println("\n私はスライムを倒した！");
                            System.out.println("私は16の経験値を手に入れた！");
                            System.out.println("私は1080円を手に入れた！");
                            flag = false;
                            break;
                        }
                        System.out.println("\n\n\nスライムの攻撃！");
                        watasiHp -= 10;
                        System.out.println("\n私は10のダメージを受けた");
                        System.out.println("\n--私のHP：" + watasiHp + " --");
                        System.out.println("--スライムのHP：" + slimeHp + " --");
                        if (watasiHp <= 0) {
                            System.out.println("\n私は力尽きた…。");
                            flag = false;
                        }
                        break;
                    case 2:
                        System.out.println("\n私は逃げ出した");
                        flag = false;
                        break;
                    default:
                        System.out.println("\n1か2を入力してください");
                }
                // TODO: ここ理解して書く
                count++;
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
            // TODO: ここ理解して書く
        for (int i = 1; i <= count; i++) {
            System.out.println(i + "回目の選択" + history[i-1]);
        }
    }

}