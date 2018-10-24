package com.buzzimonitor.desafio.model;

import java.util.List;

public class AuthorTwitter {
	
	private String name;
	private String name_searchable;
	private String description;
	private List<String> bios;
	private Long followers;
	private Long friends;
	private String location;
	private String location_searchable;
	private String gender;
	private Boolean updated;
	private String created_at;
	private String screenname;
	private String profile_image_url;
	private Long tweets;
	
	public AuthorTwitter() {}

	public AuthorTwitter(String name, String name_searchable, String description, List<String> bios, Long followers,
			Long friends, String location, String location_searchable, String gender, Boolean updated,
			String created_at, String screenname, String profile_image_url, Long tweets) {
		super();
		this.name = name;
		this.name_searchable = name_searchable;
		this.description = description;
		this.bios = bios;
		this.followers = followers;
		this.friends = friends;
		this.location = location;
		this.location_searchable = location_searchable;
		this.gender = gender;
		this.updated = updated;
		this.created_at = created_at;
		this.screenname = screenname;
		this.profile_image_url = profile_image_url;
		this.tweets = tweets;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getBios() {
		return bios;
	}

	public void setBios(List<String> bios) {
		this.bios = bios;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation_searchable() {
		return location_searchable;
	}

	public void setLocation_searchable(String location_searchable) {
		this.location_searchable = location_searchable;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getUpdated() {
		return updated;
	}

	public void setUpdated(Boolean updated) {
		this.updated = updated;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getScreenname() {
		return screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public String getProfile_image_url() {
		return profile_image_url;
	}

	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}

	public Long getTweets() {
		return tweets;
	}

	public void setTweets(Long tweets) {
		this.tweets = tweets;
	};
}
