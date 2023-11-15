package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		// 車クラスのインスタンスを作成する
		Car_Chapter14 gear = new Car_Chapter14(3,30);
		Car_Chapter14 speed = new Car_Chapter14(3,30); 		
		
		// 車クラスのgearChangeメソッドを実行する
		gear.gearChange(3);
		
		// 車クラスのrunメソッドを実行する。
		speed.run();
		
	}

}


