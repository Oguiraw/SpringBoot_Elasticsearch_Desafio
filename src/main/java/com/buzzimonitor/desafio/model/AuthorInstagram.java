package com.buzzimonitor.desafio.model;

public class AuthorInstagram {
	
	private String login;
	private String name;
	private String name_searchable;
	private Long followers;
	private Long friends;
	private Long tweets_count;
	private String image;
	private String gender;
	private Boolean update;

	public AuthorInstagram() {}

	public AuthorInstagram(String login, String name, String name_searchable, Long followers, Long friends,
			Long tweets_count, String image, String gender, Boolean update) {
		super();
		this.login = login;
		this.name = name;
		this.name_searchable = name_searchable;
		this.followers = followers;
		this.friends = friends;
		this.tweets_count = tweets_count;
		this.image = image;
		this.gender = gender;
		this.update = update;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_searchable() {
		return name_searchable;
	}

	public void setName_searchable(String name_searchable) {
		this.name_searchable = name_searchable;
	}

	public Long getFollowers() {
		return followers;
	}

	public void setFollowers(Long followers) {
		this.followers = followers;
	}

	public Long getFriends() {
		return friends;
	}

	public void setFriends(Long friends) {
		this.friends = friends;
	}

	public Long getTweets_count() {
		return tweets_count;
	}

	public void setTweets_count(Long tweets_count) {
		this.tweets_count = tweets_count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getUpdate() {
		return update;
	}

	public void setUpdate(Boolean update) {
		this.update = update;
	}
	
	
	
}
