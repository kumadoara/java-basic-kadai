package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {

	// 名を表すメソッド
	void setGivenName(String givenName) {
		this.givenName = "一郎";
	}
	
	// 個別の紹介を出力する抽象メソッドの具体的処理
	void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}