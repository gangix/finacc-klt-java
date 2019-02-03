package de.c24.finacc.klt.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import de.c24.finacc.klt.model.User;
import de.c24.finacc.klt.service.UserService;

@Controller
public class IndexController {

	@Autowired
	UserService userService;

	@GetMapping(path = { "/", "/index" })
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("formName", "Anmeldeformular");
		mav.setViewName("index");
		return mav;
	}

	@PostMapping(path = "/register")
	public ModelAndView register(@ModelAttribute @Valid User user, Errors errors, ModelAndView mav) throws Exception {
		if (errors.hasErrors()) {
			mav.addObject("formName", "Anmeldeformular");
			mav.setViewName("index");
			return mav;
		}
		userService.save(user);
		return listAll();
	}

	@GetMapping(path = "/delete/{id}")
	public ModelAndView delete(@PathVariable Long id) throws Exception {
		userService.delete(id);
		return listAll();
	}

	@GetMapping(value = "/listUsers")
	public ModelAndView listAll() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<User> userList = userService.getAll();
		mav.addObject("userList", userList);
		mav.setViewName("userList");
		return mav;
	}
}
