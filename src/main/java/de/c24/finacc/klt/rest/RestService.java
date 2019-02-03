package de.c24.finacc.klt.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.c24.finacc.klt.service.AgeService;

@RestController
public class RestService {

	@Autowired
	AgeService ageService;
	
	@GetMapping(path = "/klt/rest/rest/age/{age}")
	public ResponseEntity<String> ageResolver(@PathVariable(name = "age", required = true) int age) throws Exception {
		return ResponseEntity.ok(ageService.ageResolver(age));
	}
	
    public Map<String, String> getTestMap() {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("fisch", "suppe");
        return returnMap;
    }


}
