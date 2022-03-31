package maybankspringbootuuid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping("/")
	public String index() {
		User user = new User();
		user.setUser_name("kia1");
		user.setRole_id("123");
		user.setUser_password("123");
		service.save(user);
		System.out.println("save: " + user);
		return null;
	}
}
