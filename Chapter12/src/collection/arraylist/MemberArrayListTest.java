package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이도현");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박보검");
		Member memberHong = new Member(1004,"홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHong.getMemberId());
		
		memberArrayList.showAllMember();
		
		Member memberkim = new Member(1005,"김재욱");
		memberArrayList.insertMember(memberkim, 2);
		memberArrayList.showAllMember();
		
		
	}

}
