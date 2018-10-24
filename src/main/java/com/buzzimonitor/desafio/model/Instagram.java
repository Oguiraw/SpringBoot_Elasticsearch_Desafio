package com.buzzimonitor.desafio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.buzzimonitor.desafio.core.model.Model;

@Document(indexName = "buzzimonitor", type = "instagram")
public class Instagram extends Model<String>{
	
	@Id
	private String id;
	private String interaction_type;
	private String post_id;
	private String sentiment;
	private String service;
	private Long likes;
	private Long replies;
	private Boolean archived;
	private AuthorInstagram author;
	private String application;
	private String origin;
	private String type;
	private String link;
	private Long count;
	private Long engagement;
	private String collected_time;
	private Long reach;
	private Long impressions;
	private String source;
	private String brand;
	private String date;
	private Long comments_amounts;
	private String elasticsearch_id;
	private String elasticsearch_routing;
	private String picture_full_size;
	private String elasticsearch_index;
	private String external_id;
	private String user;
	
	public Instagram() {}
	
	public Instagram(String id, String interaction_type, String post_id, String sentiment, String service, Long likes,
			Long replies, Boolean archived, AuthorInstagram author, String application, String origin, String type,
			String link, Long count, Long engagement, String collected_time, Long reach, Long impressions,
			String source, String brand, String date, Long comments_amounts, String elasticsearch_id,
			String elasticsearch_routing, String picture_full_size, String elasticsearch_index, String external_id,
			String user) {
		super();
		this.id = id;
		this.interaction_type = interaction_type;
		this.post_id = post_id;
		this.sentiment = sentiment;
		this.service = service;
		this.likes = likes;
		this.replies = replies;
		this.archived = archived;
		this.author = author;
		this.application = application;
		this.origin = origin;
		this.type = type;
		this.link = link;
		this.count = count;
		this.engagement = engagement;
		this.collected_time = collected_time;
		this.reach = reach;
		this.impressions = impressions;
		this.source = source;
		this.brand = brand;
		this.date = date;
		this.comments_amounts = comments_amounts;
		this.elasticsearch_id = elasticsearch_id;
		this.elasticsearch_routing = elasticsearch_routing;
		this.picture_full_size = picture_full_size;
		this.elasticsearch_index = elasticsearch_index;
		this.external_id = external_id;
		this.user = user;
	}

	public String getInteraction_type() {
		return interaction_type;
	}

	public void setInteraction_type(String interaction_type) {
		this.interaction_type = interaction_type;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public Long getReplies() {
		return replies;
	}

	public void setReplies(Long replies) {
		this.replies = replies;
	}

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public AuthorInstagram getAuthor() {
		return author;
	}

	public void setAuthor(AuthorInstagram author) {
		this.author = author;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getEngagement() {
		return engagement;
	}

	public void setEngagement(Long engagement) {
		this.engagement = engagement;
	}

	public String getCollected_time() {
		return collected_time;
	}

	public void setCollected_time(String collected_time) {
		this.collected_time = collected_time;
	}

	public Long getReach() {
		return reach;
	}

	public void setReach(Long reach) {
		this.reach = reach;
	}

	public Long getImpressions() {
		return impressions;
	}

	public void setImpressions(Long impressions) {
		this.impressions = impressions;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getComments_amounts() {
		return comments_amounts;
	}

	public void setComments_amounts(Long comments_amounts) {
		this.comments_amounts = comments_amounts;
	}

	public String getElasticsearch_id() {
		return elasticsearch_id;
	}

	public void setElasticsearch_id(String elasticsearch_id) {
		this.elasticsearch_id = elasticsearch_id;
	}

	public String getElasticsearch_routing() {
		return elasticsearch_routing;
	}

	public void setElasticsearch_routing(String elasticsearch_routing) {
		this.elasticsearch_routing = elasticsearch_routing;
	}

	public String getPicture_full_size() {
		return picture_full_size;
	}

	public void setPicture_full_size(String picture_full_size) {
		this.picture_full_size = picture_full_size;
	}

	public String getElasticsearch_index() {
		return elasticsearch_index;
	}

	public void setElasticsearch_index(String elasticsearch_index) {
		this.elasticsearch_index = elasticsearch_index;
	}

	public String getExternal_id() {
		return external_id;
	}

	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;		
	}

}
