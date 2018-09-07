package com.test.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class States {
	@Id
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="areacode")
	private String areaCode;
	@Column(name="population")
	private String population;

	public States() {
	}

	public States(int id, String name, String areaCode, String population) {
		super();
		this.id = id;
		this.name = name;
		this.areaCode = areaCode;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "States [id=" + id + ", name=" + name + ", areaCode=" + areaCode + ", population=" + population + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		States other = (States) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
