package com.devsuperior.desmovie.entities;

public class Movie {
	
	private Long id;
	private String title;
	private Double score;
	privete Integer count;
	private Strig image;
	
	public Movie() {
		
	}

	public Movie(Long id, String title, Double score, privete integer, Strig image) {
		this.id = id;
		this.title = title;
		this.score = score;
		Integer = integer;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public privete getInteger() {
		return Integer;
	}

	public void setInteger(privete integer) {
		Integer = integer;
	}

	public Strig getImage() {
		return image;
	}

	public void setImage(Strig image) {
		this.image = image;
	}
	
	
}
	
	
