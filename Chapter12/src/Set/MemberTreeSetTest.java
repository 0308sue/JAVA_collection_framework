package Set;

import collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"이도현");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박보검");
		Member memberHong = new Member(1004,"홍길동");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
		memberTreeSet.removeMember(memberHong.getMemberId());
		
		memberTreeSet.showAllMember();
		
		Member memberkim = new Member(1005,"김재욱");
		memberTreeSet.addMember(memberkim);
		memberTreeSet.showAllMember();
		
		
	}

}
