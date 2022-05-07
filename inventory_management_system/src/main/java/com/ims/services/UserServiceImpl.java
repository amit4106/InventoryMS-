package com.ims.services;

import com.ims.repository.UserRepo;
import com.ims.repository.UserRepoImpl;

public class UserServiceImpl implements UserService {

	@Override
	public boolean verifyUser(String username, String password) {
		UserRepo repo=new UserRepoImpl();
		String user = repo.fetchUser(username, password);
		return user.isEmpty()?false:true;
	}
	

}
