package com.driver.services;
//import com.driver
import com.driver.model.User;

public interface UserService {

	void deleteUser(Integer userId);
	User updatePassword(Integer userId, String password);
    void register(String name, String phoneNumber, String password);
}
