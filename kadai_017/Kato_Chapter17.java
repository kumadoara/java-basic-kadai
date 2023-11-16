package kadai_017;

abstract public class Kato_Chapter17 {
	
	// 名を表すメソッド
	void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	// 個別の紹介を出力する抽象メソッド	
	abstract void eachIntroduce();
	
	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + this.givenName + "です" );
		System.out.println("住所は" + address +  "です" );
	}
	
	// 紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce	();
		eachIntroduce();
	}

	// 姓を表すフィールド
	public String familyName = "加藤";

	// 名を表すフィールド
	public String givenName;
	
	// 住所を表すフィールド
	public String address =  "東京都中野区〇×";
	
	
}


