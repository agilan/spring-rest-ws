/**
 * 
 */
package com.sample.restws.service;

import java.util.List;

import com.sample.restws.model.User;

/**
 * @author Mugilan
 *
 */
public interface UserService {

	User findById(long id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(long id);

	List<User> findAllUsers();

	void deleteAllUsers();

	public boolean isUserExist(User user);

}
