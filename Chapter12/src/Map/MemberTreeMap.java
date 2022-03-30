package Map;

import collection.Member;

import java.util.Iterator;
import java.util.TreeMap;



public class MemberTreeMap {
	private TreeMap<Integer,Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(),member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {//HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면 
			treeMap.remove(memberId);//해당 회원 삭제 
				return true;
				}
			System.out.println(memberId + " 가 존재하지 않습니다.");
			return false;
		}
		
		public void showAllMember() {
			Iterator<Integer> ir = treeMap.keySet().iterator();
			while (ir.hasNext()) { //다음 key가 있으면
				int key = ir.next(); //key 값을 가져와서 
				Member member = treeMap.get(key);//key로부터 value 가져오기
					System.out.println(member);
				}
				System.out.println();
		}
	}
