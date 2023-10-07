package java_labo;

public class hanoiClass {

	public static void main(String[] args) {
		//ハノイの塔攻略　塔が三本を前提とする
		
		//定義
		String[] tower = {"A","B","C"};
		String before = "B";
		String after = "C";
		int board = 8;
		
		
		
		//開始
		System.out.println("ハノイの塔の攻略");
		System.out.println("ここでは塔を左からA、B、Cと表記する");
		
		//入力
		System.out.println("移動前の塔を入力");
		//before = InputStream();
		System.out.println("移動先の塔を入力");
		//after = InputStream();
		System.out.println("移動する枚数を入力");
		//board = InputStream();
		
		//確認用
		System.out.println("移動前確認：" + before);
		System.out.println("移動後確認：" + after);
		System.out.println("移動枚数確認：" + board);
		
		//before&afterをStringから配列の要素番号intに変換
		int left = 0;
		int right = 0;
		if ( before == "A") {
			left = 0;
		}else if ( before == "B") {
			left = 1;
		}else if ( before == "C") {
			left = 2;
		}
		
		if ( after == "A") {
			right = 0;
		}else if ( after == "B") {
			right = 1;
		}else if ( after == "C") {
			right = 2;
		}
		
		//最小理論値算出
		int ideal = 1;
		for (int i = 0; i < board; i++) {
			ideal *= 2;
		}
		ideal -= 1;
		
		
		//手順出力　移動手順の羅列　エンター押すたびに一行出力
		System.out.println("手順開始");
		
		int num=8;
		//for(int n = 0; n < board; n++) {
		
		//判定
			//偶数の場合1枚目は移動先じゃない塔へ、奇数の場合１枚目は移動先の塔へ
			if (num % 2 == 0) {
				if(!(left == 0) && !(right == 0)) {
					right = 0;
				}else if(!(left == 1) && !(right == 1)) {
					right = 1;
				}else if(!(left == 2) && !(right == 2)){
					right = 2;
				}
			}
			System.out.println(num + "," + tower[left] + "→" + tower[right]);

		
		//}
		
		System.out.println("手順終了");
		
		//実行手数カウント
		
		
		//実行手数と最小理論値を比較
		System.out.println("最小理論値は" + ideal + "手");
		System.out.println("提示された手順は合計" + "" + "手");
		
		//確認用
		System.out.print("," + before);
		System.out.print("," + after);
		System.out.println("," + board);
	}

}
