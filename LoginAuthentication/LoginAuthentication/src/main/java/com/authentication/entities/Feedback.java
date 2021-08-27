package com.authentication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rid;
	
	private String rating;

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Feedback [rid=" + rid + ", rating=" + rating + "]";
	}



	
}
