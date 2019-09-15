package colLesson01;

import java.util.Scanner;

public class ColLesson01 {

    private static String[] args = new String[256]; // 配列の作成
    private static int[] count = new int[256]; // 配列の作成

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // キーボードからの読み取り
        int number = 0;

        keyType: while (true) {
            System.out.println("【リストに登録： 1 リストの表示： 2 終了： 3】");
            if (!scan.hasNextInt()) {
                System.out.println("数字を入力してください");
                scan.nextLine();
                continue;
            }
            number = scan.nextInt();
            switch (number) {
                case 1:
                    scan.nextLine();
                    registerWord();
                    break;
                case 2:
                    scan.nextLine();
                    showList();
                    break;
                case 3:
                    scan.nextLine();
                    break keyType;
                default:
                    scan.nextLine();
            }
        }
        System.out.println("プログラムを終了しました");
    }

    private static void registerWord() {
        /* 単語の登録クラス */

        String words;
        System.out.println("文字入力 :");
        Scanner scan = new Scanner(System.in);
        words = scan.next();

        for (int i = 0; i < args.length; i++) {
            if (args[i] == null) {
                args[i] = words;
                count[i] = 1;
                System.out.printf("単語[%s]を登録しました%n", words);
                break;
            } else if (args[i].equals(words)) {
                System.out.println(i);
                System.out.printf("単語[%s]は既に%d回登録済みです%n", words, count[i]);
                count[i]++;
                break;
            }
        }
    }

    private static void showList() {
        /* 登録リストの表示クラス */
        if (args[0] == null) {
            System.out.println("登録件数0件です");
            return;
        }
        for (int i = 0; args[i] != null; i++) {
            System.out.printf("%3d件目登録単語[%s] 登録回数%d回%n", i + 1, args[i], count[i]);
        }
    }
//    private static String[] args = new String[256]; // 配列の作成
//    private static int[] count = new int[256]; // 配列の作成

    public static void Main(String[] args) {
        Scanner scan = new Scanner(System.in); // キーボードからの読み取り
        int number = 0;

        keyType: while (true) {
            System.out.println("【リストに登録： 1 リストの表示： 2 終了： 3】");
            if (!scan.hasNextInt()) {
                System.out.println("数字を入力してください");
                scan.nextLine();
                continue;
            }
            number = scan.nextInt();
            switch (number) {
                case 1:
                    scan.nextLine();
                    registerWord();
                    break;
                case 2:
                    scan.nextLine();
                    showList();
                    break;
                case 3:
                    scan.nextLine();
                    break keyType;
                default:
                    scan.nextLine();
            }
        }
        System.out.println("プログラムを終了しました");
    }

    private static void Word() {
        /* 単語の登録クラス */

        String words;
        System.out.println("文字入力 :");
        Scanner scan = new Scanner(System.in);
        words = scan.next();

        for (int i = 0; i < args.length; i++) {
            if (args[i] == null) {
                args[i] = words;
                count[i] = 1;
                System.out.printf("単語[%s]を登録しました%n", words);
                break;
            } else if (args[i].equals(words)) {
                System.out.println(i);
                System.out.printf("単語[%s]は既に%d回登録済みです%n", words, count[i]);
                count[i]++;
                break;
            }
        }
    }

    private static void WordList() {
        /* 登録リストの表示クラス */
        if (args[0] == null) {
            System.out.println("登録件数0件です");
            return;
        }
        for (int i = 0; args[i] != null; i++) {
            System.out.printf("%3d件目登録単語[%s] 登録回数%d回%n", i + 1, args[i], count[i]);
        }
    }
}