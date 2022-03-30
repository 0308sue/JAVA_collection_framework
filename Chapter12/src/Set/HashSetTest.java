package Set;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("이도현"));
		hashSet.add(new String("서강준"));
		hashSet.add(new String("이수혁"));
		hashSet.add(new String("박보검"));
		hashSet.add(new String("박보검"));
		
		System.out.println(hashSet);
	}

}
