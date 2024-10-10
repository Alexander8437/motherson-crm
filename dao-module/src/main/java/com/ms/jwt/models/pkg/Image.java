package com.ms.jwt.models.pkg;

import javax.persistence.Embeddable;

@Embeddable
public class Image {

	private String id;
	private String url;
	private String description;
	private String altText;
	private int orderr;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}

	public int getOrderr() {
		return orderr;
	}

	public void setOrderr(int orderr) {
		this.orderr = orderr;
	}

	 

}