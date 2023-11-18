package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	
	public void exediction(String[] words) {
		//　HashMapを宣言し、辞書に英単語と意味を追加
		HashMap<String,String> dicMap = new HashMap<String,String>();{
		dicMap.put("apple","りんご");
		dicMap.put("peach","桃");
		dicMap.put("banana","バナナ");
		dicMap.put("lemon","レモン");
		dicMap.put("pear","梨");
		dicMap.put("kiwi","キウィ");
		dicMap.put("strawberry","いちご");
		dicMap.put("grape","ぶどう");
		dicMap.put("muscat","マスカット");
		dicMap.put("cherry","さくらんぼ");
			
			
		for (int i = 0; i < words.length; i++) {
			// 指定したキーが存在するかcontainKeyで確認			
			if (dicMap.containsKey(words[i])) {
		        System.out.println(words[i] + "の意味は" + dicMap.get(words[i]));
		    } else {
		        System.out.println(words[i] + "は辞書に存在しません");
		    }
		}
			
		}			
	}		
}
