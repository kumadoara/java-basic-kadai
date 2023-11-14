package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		// 年代とサービスの使用料金を表す変数を宣言
		int userAge = 30, serviceCost;
		
		//swich式で各年代に応じて料金を取得		
		serviceCost = switch (userAge) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30,40 -> 3000;
			case 50,60,70 -> 4000;
			case 80 -> 5000;
			default -> 500;
			
		};
		
		// 年代と料金を出力
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}
}