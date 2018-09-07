package com.test.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {
	@Autowired
	StatesDao dao;

	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public States findById(@PathVariable("id") int id) {
		return dao.findById(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<States> findAllStates() {
		System.out.println("in controll");
		List<States> list=dao.findAllStates();
		return list;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void saveStates(@RequestBody States states) {
		dao.saveStates(states); 
	}

	public void updateStates(States states) {
	}

	public void deleteStatesByID(int id) {
	}

	public void deleteAllStates() {
	}

}
