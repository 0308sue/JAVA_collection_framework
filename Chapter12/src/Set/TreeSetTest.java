package Set;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(new String("이도현"));
		treeSet.add(new String("서강준"));
		treeSet.add(new String("이수혁"));
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
