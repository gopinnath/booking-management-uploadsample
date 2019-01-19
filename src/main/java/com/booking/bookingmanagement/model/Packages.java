package com.booking.bookingmanagement.model;

import java.io.Serializable;
import java.util.Arrays;

public class Packages  implements Serializable  {
	
	private static final long serialVersionUID = 74458L; 
	
	private Long id;
	
	private String name;
	
	private String description;

	private float price;

	private byte[]  image;

	private String filename;

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return id;
	}

	public byte[]  getImage() {
		return image;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setImage(byte[]  image) {
		this.image = image;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "Packages [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", image=" + Arrays.toString(image) + ", filename=" + filename + "]";
	}
	
}
