package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter20 dictExec = new Dictionary_Chapter20();
		
		// 調べる英単語を配列にセットする
		String[] words = {"apple", "banana", "grape", "orange"};
		
		// 辞書を調べるメソッドを実行する
		dictExec.exediction(words);

		
	}

}
