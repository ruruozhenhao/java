package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (s.equals("abc3")) {
				list.add("ABC3");
			}
			System.out.println(s);
		}

	}

}
