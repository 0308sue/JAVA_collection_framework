package Map;

import collection.Member;
import collection.arraylist.MemberArrayList;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap membertreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(1001,"이도현");
		Member memberPark = new Member(1003,"박보검");
		Member memberSon = new Member(1002,"손흥민");
		Member memberHong = new Member(1004,"홍길동");
		
		membertreeMap.addMember(memberLee);
		membertreeMap.addMember(memberSon);
		membertreeMap.addMember(memberPark);
		membertreeMap.addMember(memberHong);
		
		membertreeMap.showAllMember();
	
		
		membertreeMap.removeMember(1004);
		membertreeMap.showAllMember();

	}

}
