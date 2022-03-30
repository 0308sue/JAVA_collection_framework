package Set;

import collection.Member;
import collection.arraylist.MemberArrayList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001,"이도현");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박보검");
		Member memberHong = new Member(1004,"홍길동");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
	
		
		Member memberkim = new Member(1004,"김재욱");
		memberHashSet.addMember(memberkim);
		memberHashSet.showAllMember();

	}

}
