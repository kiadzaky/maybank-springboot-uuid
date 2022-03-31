package maybankspringbootuuid;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService{
	@Autowired
	private UserRepository repository;
	
	public void save (User user) {
//		user.setUser_id(null);
//		user.setRole_id("123");
//		user.setUser_name("kia");
//		user.setUser_password("123");
//		System.out.println("save: " + user);
		repository.save(user);
	}

}
