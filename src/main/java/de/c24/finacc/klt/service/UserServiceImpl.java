/**
 * 
 */
package de.c24.finacc.klt.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.c24.finacc.klt.exceptions.AgeIsNotValidException;
import de.c24.finacc.klt.model.User;
import de.c24.finacc.klt.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private final AgeService ageService;
	
	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository, AgeService ageService) {
		super();
		this.userRepository = userRepository;
		this.ageService = ageService;
	}

	public User save(User user) throws Exception {
		validation(user);
		return userRepository.save(user);
	}

	private void validation(User user) throws Exception{
		String ageResolver = ageService.ageResolver(user.getAge());
		if(!ageResolver.equals("OK") && !ageResolver.equals("funny")) {
			throw new AgeIsNotValidException();
		}
		
	}

	public void delete(Long id) throws Exception {
		userRepository.deleteById(id);
	}

	@Override
	public List<User> getAll() throws Exception {
		Iterable<User> iterateList = userRepository.findAll();
		List<User> userList = StreamSupport.stream(iterateList.spliterator(), false).collect(Collectors.toList());

		return userList;
	}

}
