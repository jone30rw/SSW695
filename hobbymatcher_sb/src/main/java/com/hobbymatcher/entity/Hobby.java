package com.hobbymatcher.entity;

import java.io.Serializable;

public class Hobby implements Serializable {
	private static final long serialVersionUID = 3886854875271518921L;

	private String hobbyId;
	private String name;
	private String description;
	private String classification;
	private String constrains;
	private String blogs;
	private String status;
	private String hobbyImage;

	public String getHobbyImage() {
		return hobbyImage;
	}

	public void setHobbyImage(String hobbyImage) {
		this.hobbyImage = hobbyImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobbyId() {
		return hobbyId;
	}

	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {

		this.classification = classification;
	}

	public String getConstrains() {
		return constrains;
	}

	public void setConstrains(String constrains) {
		this.constrains = constrains;
	}

	public String getBlogs() {
		return blogs;
	}

	public void setBlogs(String blogs) {
		this.blogs = blogs;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
