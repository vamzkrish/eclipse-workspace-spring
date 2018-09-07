package com.test.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatesDao {
	@Autowired
	StatesRepos statesrepos;

	public States findById(int id) {
		return statesrepos.getOne(id);
	}

	public void saveStates(States states) {
		statesrepos.save(states);
	}

	public void updateStates(States states) {
		statesrepos.save(states);
	}

	public void deleteStatesByID(int id) {
		statesrepos.delete(id);
	}

	public void deleteAllStates() {
		statesrepos.deleteAll();
	}

	public List<States> findAllStates() {
		System.out.println("in daoooo");
		List<States> list = statesrepos.findAll();
		return list;
	}

	public boolean isStatesExists(States states) {
		return statesrepos.exists(states.getId());
	}

}
