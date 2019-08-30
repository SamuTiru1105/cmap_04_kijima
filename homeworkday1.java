package com.company;

import java.io.*;
import java.util.Random;

public class homeworkday1 {
    static int watasiHp = 100;
    static int slimeHp = 100;
    public static void main(String[] args) {
        try {
            System.out.println("--私のHP：" + watasiHp + " --");
            System.out.println("--スライムのHP：" + slimeHp + " --");
            boolean flag = true;
            while (flag) {
                System.out.println("\nどうする？ 1：戦う 2：逃げる");
                System.out.print("コマンドを数字で入力→ ");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String str = br.readLine();
                int choice = Integer.parseInt(str);
                switch (choice) {
                    case 1:
                        System.out.println("\n私は戦うことを選んだ！");
                        Random random = new Random();
                        int critical = random.nextInt(4);
                        System.out.println("\n私の攻撃！！");
                        if (critical == 1) {
                            System.out.println("\n私は会心の一撃をはなった！！");
                            slimeHp -= 50;
                            System.out.println("\nスライムに30のダメージを与えた！");
                        } else {
                            slimeHp -= 10;
                            System.out.println("\nスライムに10のダメージを与えた！");
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
                        watasiHp -= 15;
                        System.out.println("\n私は15のダメージを受けた");
                        System.out.println("\n--私のHP：" + watasiHp + " --");
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
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
