package com.swag.SwagDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GlassesDAO {
	@Autowired
	GlassesRepos glassesRepos;

	public Glasses findById(int id) {
		return glassesRepos.getOne(id);
	}

	public void saveGlasses(Glasses glasses) {
		glassesRepos.save(glasses);
	}

	public void updateGlasses(Glasses glasses) {
		glassesRepos.save(glasses);
	}

	public void deleteGlassesByID(int id) {
		glassesRepos.deleteById(id);
	}

	public void deleteAllGlasses() {
		glassesRepos.deleteAll();
	}

	public List<Glasses> findAllGlasses() {
		System.out.println("in daoooo");
		List<Glasses> list = glassesRepos.findAll();
		return list;
	}

	public boolean isGlassesExists(Glasses glasses) {
		return glassesRepos.existsById(glasses.getId());
	}
	}
