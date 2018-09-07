package com.swag.SwagDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GlassController {
	@Autowired
	GlassesDAO dao;

	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public Glasses findById(@PathVariable("id") int id) {
		return dao.findById(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Glasses> findAllStates() {
		System.out.println("in controll");
		List<Glasses> list=dao.findAllGlasses();
		return list;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveGlasses(@RequestBody Glasses glasses) {
		dao.saveGlasses(glasses); 
	}

	public void updateGlasses(Glasses glasses) {
	}

	public void deleteGlassesByID(int id) {
	}

	public void deleteAllGlasses() {
	}

}

