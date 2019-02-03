package de.c24.finacc.klt.service;

import java.util.List;

import de.c24.finacc.klt.model.User;

public interface UserService {
	public User save(User u) throws Exception;
	public void delete(Long id) throws Exception;
	public List<User> getAll() throws Exception;
}
