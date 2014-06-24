package net.cr.abrand.controls;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cr.abrand.services.AuthService;
import net.cr.abrand.vo.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/auth")
public class MemberControl {
	@Autowired AuthService authService;
	
	@RequestMapping("/login")
	public String login(
			String name,  //name과 같으면 바로 받을 수있음.
			@RequestParam("password") String pwd, //지정해서 password로 온 파라미터를 pwd에저장
			HttpServletResponse response,
			HttpSession session) throws Exception {
		
		Member member = authService.getUserInfo(name, pwd);
		
		if (member != null) {
			session.setAttribute("member", member);
			return "redirect:../main.jsp";
		} else {
			session.invalidate();
			return "/auth/loginFail.jsp";
		}
	}
	
}







