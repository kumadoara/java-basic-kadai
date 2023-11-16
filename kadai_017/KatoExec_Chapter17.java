package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		// 各子クラスのインスタンスを作成
		Kato_Chapter17 taro = new KatoTaro_Chapter17();		
		Kato_Chapter17 ichiro = new  KatoIchiro_Chapter17();
		Kato_Chapter17 hanako = new KatoHanako_Chapter17();
		
		
	
		// 	KatoTaro_Chapter17インスタンスのsetGivenNameメソッドを実行
		taro.setGivenName("太郎");
	
		// 	KatoIchiro_Chapter17インスタンスのsetGivenNameメソッドを実行
		ichiro.setGivenName("一郎");
	
		// 	KatoHanako_Chapter17インスタンスのsetGivenNameメソッドを実行
		hanako.setGivenName("花子");
		

		// execIntroduceメソッドを実行する
		taro.execIntroduce ();
		ichiro.execIntroduce ();
		hanako.execIntroduce ();
		
	}

	
}
