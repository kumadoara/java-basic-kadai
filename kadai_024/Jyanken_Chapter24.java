package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoise() {
		//Scannerクラスのオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		
		//入力した内容を取得する
		String input = "";
		
		//自分のじゃんけんの手を入力する
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
		
			//　手を入力
			input =	scanner.next();
			
		
			//　じゃんけんが正しいかどうか
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			} else {
				System.out.println("エラーです。再度入力してください。");
			}
		}
		
		//Scannerクラスのオブジェクトをクローズする
		scanner.close();
		return input;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String GetRandom() {
		//配列にじゃんけんの手をセット
		String[] pcHhands = {"r", "s", "p"};
		
		//乱数で対戦相手の手を選ぶ
		String pcHand = pcHhands[(int)Math.floor(Math.random() * 3)];
		return pcHand;
	        

	}
		
		
	//じゃんけんを行うメソッド
	public void playGame() {
		String myhand = getMyChoise();
		String userhand = GetRandom();
		
		HashMap<String,String> handMap = new HashMap<String,String>();

		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p","パー");
	
		System.out.println("自分の手は" + handMap.get(myhand) + "対戦相手の手は" + handMap.get(userhand));
		
		if (myhand.equals("r") && userhand.equals("s") || myhand.equals("s") && userhand.equals("p") || myhand.equals("p") && userhand.equals("r")) {
			System.out.println("自分の勝ちです");
		} else if (myhand.equals("r") && userhand.equals("p") || myhand.equals("s") && userhand.equals("r") || myhand.equals("p") && userhand.equals("s")) {
			System.out.println("自分の負けです");
		} else 
			System.out.println("あいこです");
	
	}
}



	
