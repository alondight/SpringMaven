package net.cr.abrand.services;


import net.cr.abrand.dao.MemberDao;
import net.cr.abrand.vo.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthService {
	@Autowired MemberDao memberDao;
	
	public Member getUserInfo(String name, String password) throws Exception {
		return memberDao.getMember(name, password);
	}
}














