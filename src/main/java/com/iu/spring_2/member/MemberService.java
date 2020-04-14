package com.iu.spring_2.member;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		memberDAO = new MemberDAO();
	}

	//1. Join
	public int memberJoin(MemberVO memberDTO) throws Exception{
		return memberDAO.memberJoin(memberDTO);
	}
	
	//2. Login
	public MemberVO memberLogin(MemberVO memberDTO) throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
	
	//3. My Page
	public MemberVO memberPage(String id) throws Exception{
		return memberDAO.memberPage(id);
	}
	
	//4. MemberDelete(파라미터)
//	public int memberDelete(String id) throws Exception{
//		return memberDAO.memberDelete(id);
//	}
	
	//4.1 MemberDelete(세션)
	public int memberDelete(MemberVO memberDTO) throws Exception{
		return memberDAO.memberDelete(memberDTO);
	}
	
	//5. MemberUpdate
	public int memberUpdate(MemberVO memberDTO) throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
	
	
}//end class
