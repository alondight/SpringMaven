package net.cr.abrand.dao;

import java.util.HashMap;
import java.util.List;

import net.cr.abrand.vo.Member;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	@Autowired SqlSessionFactory sqlSessionFactory;
	
	public MemberDao() {	}
	
	public Member getMember(String name, String password) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			HashMap<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("name", name);
			paramMap.put("password", password);
			
			Member member = sqlSession.selectOne(
				"aa.getMember",
				paramMap);
				
			return member;
			
		} catch (Exception e) {
			throw e;
			
		} finally {
			try {sqlSession.close();} catch (Exception e) {}
		}		
	}
}




