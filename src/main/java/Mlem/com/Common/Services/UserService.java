package Mlem.com.Common.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mlem.com.Common.Entity.User;
import Mlem.com.Common.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public void processOAuthPostLogin(User user) {
		User existUser = repo.getUserByEmail(user.getEmail(),user.getProvider());
		System.out.print("find user"+existUser);
		
		if (existUser == null) {	
			
			repo.save(user);
			
		}
		
		
		
	}
	
}