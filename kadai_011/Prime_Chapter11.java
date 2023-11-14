package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		// 配列を作成し、変数に代入
		boolean [] prime  = new boolean[101];
		
		// for文で繰り返しtrueで初期化
		for ( int i = 1; i < prime.length; i++ ) {
			prime[i] = true;
		}
			//　割る数の初期値を2として変数に代入して初期化
			int primeNumber = 2;
			
			// 割る数で割り切れるか判定、割り切れる場合はfalseとして処理を飛ばす			
			while( primeNumber < prime.length) {
				for ( int i = primeNumber + 1; i< prime.length; i++ ) {
					if ( i % primeNumber == 0) {
						prime[i] = false;
							continue;						
					}
				}
					
				primeNumber += 1;
								
			}
			
			// 素数を出力			
			for ( int i = 2; i < prime.length; i++ ) {
				if (prime[i]) {
					System.out.println(i);
			}	
					
		}		

	}	
}
