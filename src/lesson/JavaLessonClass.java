package lesson;  //パッケージ

public class JavaLessonClass {  //クラス宣言

	  public static void main(String[] args) {  //Java実行のためのメソッド
		    System.out.print("a");  //出力
		    System.out.println("Hello World");  //出力して改行
		    System.out.printf("%x", 2);  //書式を指定して出力して改行
		    
		    //書式指定子
			//  %b  boolean  真偽値
			//  %c    文字を出力
		    //  %s  string  文字列型
		    //  %d  int  整数型10進法(Decimal)
		    //  %o  int  整数型8進法
		    //  %x  int  整数型16進法
		    //  %e  float 実数型指数
		    //  %f  float 実数型小数
		    
		    //  %5s  最小5桁 右詰め
		    //  %-5d  最小5桁 左詰め
		    //  %5d  最小5桁 右詰め
		    //  %-5d  最小5桁 左詰め
		    //  %05d  5桁で表示し0で埋める
		    //  %5.3f  整数部分を最大5桁、少数部分を最大3桁で表示
		    //  %n  改行
		    
		    //  %Y  年(4桁)
		    //  %y  年(2桁)
			//  %m  月(2桁)
			//  %d  日(2桁)
			//  %e  日(1～2桁)
			//  %H  時(2桁)24時間制
			//  %I  時(1～2桁)12時間制
			//  %M  分(2桁)
			//  %S  秒(2桁)
		    //  %F  日付(2022-02-01)
		    //  %T  時刻(14:02:05)
		    
		    //  変数は小英字ではじめ、二語以上の場合キャメルケース
		    int number;  // int型の変数numberを定義
		    number = 5;  // 変数numberに5を代入
		    System.out.println(number);  // 変数numberを出力
		    
		    /* String型  文字列
		       int型  整数
		       float型   実数(小数)
		       double型  実数(小数) */
		    
		    //型変換  ～型にキャストする  と言う
		    System.out.println((int)(number * 1.5)); 
		    
		    String name;  // String型の変数nameを定義
		    name = "Wanko";  // 変数nameに"Wanko"を代入
		     System.out.println(name);  // 変数nameを出力
		     
		     //  +1　-1の時
		     System.out.println(number++);  //変数に代入してから計算
		     System.out.println(++number);  //変数に計算してから代入
		     System.out.println(number--);  //変数に代入してから計算
		     System.out.println(--number);  //変数に計算してから代入
		     
		     //  四則計算
		     System.out.println(number += 5);  //=a+b を += で省略
		     System.out.println(number -= 5);  //=a-b を -= で省略
		     System.out.println(number *= 5);  //=a*b を *= で省略
		     System.out.println(number /= 5);  //=a/b を /= で省略
		     System.out.println(number %= 5);  //=a%b を %= で省略
		     
		     //ランダム出力
		     double rand = Math.random()*100;  //randomメッソド 0～1未満の小数
		     System.out.println(rand);
		     
		     /* 比較文
		        a == b  等しい
		        a > b  aはbより大きい
		        a < b  aはbより小さい
		        a >= b  aはb以上
		        a <= b  aはb以下
		        a != b  aがbではない
		      */
		     
		     /* 論理式
		        a && b  aかつbの時
		        a || b  aまたはbの時
		        !a  aではない時
		     */
		     
		     //入力
		     
		     
		     
		     
		     //if式  条件分け
		     int x = 2;
		     if(x == 1) {
		    	 System.out.println("xは1です");
		     }else if(x == 2){
		    	 System.out.println("xは2です");
		     }else{
		    	 System.out.println("xは1でも2でもありません");
		     }
		     int b = 0;
		     if(x == 1) {
		    	 b = 2;
		     }else if(x == 2){
		    	 b = 4;
		     }else{
		    	 System.out.println("xは1でも2でもありません");
		     }
		     System.out.println("2*xは"+ b +"です");
		     
		     //繰り返し
		     //while式
		     while(x <= 4) {
		    	 System.out.println("x="+ x +"ｘはまだ5ではありません");
		    	 x += 1;
		     }
		     System.out.println("x="+ x +"ｘが5になりました");
		     
		     //for式
	}
}
