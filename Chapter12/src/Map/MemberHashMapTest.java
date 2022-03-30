package Map;

import collection.Member;
import collection.arraylist.MemberArrayList;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001,"이도현");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박보검");
		Member memberHong = new Member(1004,"홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
	
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();

	}

}
