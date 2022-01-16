package com.devsuperior.dsmovie.entities.DTO;

public class ScoreDTO {
	
	private Long movieId;
	private String email;
	private Double score;
	
	public ScoreDTO() {
		
	}

	public ScoreDTO(Long movieId, String email, Double score) {
		super();
		this.movieId = movieId;
		this.email = email;
		this.score = score;
	}

	public Long getmovieId() {
		return movieId;
	}

	public void setmovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
}
