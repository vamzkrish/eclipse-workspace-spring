package com.swag.SwagDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Glasses {
@Id	
private int id;
@Column(name="type")
private String type;
@Column(name="color")
private String color;
@Column(name="sight")
private String sight;
public Glasses() {
}

public Glasses(int id, String type, String color, String sight) {
	super();
	this.id = id;
	this.type = type;
	this.color = color;
	this.sight = sight;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getSight() {
	return sight;
}

public void setSight(String sight) {
	this.sight = sight;
}

@Override
public String toString() {
	return "Glasses [id=" + id + ", type=" + type + ", color=" + color + ", sight=" + sight + "]";
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
	Glasses other = (Glasses) obj;
	if (id != other.id)
		return false;
	return true;
}

}
