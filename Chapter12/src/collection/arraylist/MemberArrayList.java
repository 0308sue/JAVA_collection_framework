package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //arrayList 선언 
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member형으로 선언한 ArrayList 생성 
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
//		for(int i = 0;i < arrayList.size();i++) {
//			Member member = arrayList.get(i);
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//	}
//}
		
		//iterator를 사용하여 메소드 수정
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
			
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member,int index) {
		arrayList.add(index, member);
		}
}

