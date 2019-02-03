/**
 * 
 */
package de.c24.finacc.klt.service;

import org.springframework.stereotype.Service;

@Service
public class AgeServiceImpl implements AgeService {

	@Override
	public String ageResolver(int age) throws Exception {
		if (age < 18) {
			return "too young";
		}
		if (age > 67) {
			return "too old";
		}
		if(isAgePrime(age)) {
			return "funny";
		}
		return "OK";
	}

	private boolean isAgePrime(int age) {
		int m = age / 2;
		if (age == 0 || age == 1) {
			return false;
		}
		for (int i = 2; i <= m; i++) {
			if (age % i == 0) {
				return false;
			}
		}
		return true;
	}

}
