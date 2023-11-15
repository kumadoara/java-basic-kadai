package kadai_014;

// 車クラス
public class Car_Chapter14 {
	// フィールド（内部データ）
	private int gear = 1;	// 1速から5速のギアを表す
	private int speed = 10;	// ギアチェンジ後の速度を表す	
	
	// コンストラクタ（初期化処理）
	public Car_Chapter14( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;		
	}	
	
	// メソッド定義
	public void gearChange( int afterGear ) {
		this.gear = afterGear;
		// ギアの値により速度を変える
		this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		
	}
	
	public void run() {
		System.out.println("ギア1から" + this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}



