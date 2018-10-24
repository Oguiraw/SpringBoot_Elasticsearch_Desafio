package com.buzzimonitor.desafio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.buzzimonitor.desafio.core.model.Model;

@Document(indexName = "buzzimonitor", type = "twitter")
public class Twitter extends Model<String>{

	@Id
    private String id;
	private String interaction_type;
	private String post_id;
	private String content;
	private String rt;
	private String sentiment;
	private String service;
	private String collected_from;
	private Boolean archived;
	private AuthorTwitter author;
	private List<String> urls;
	private String application;
	private String origin;
	private Boolean replied;
	private Long count;
	private String in_reply_to;
	private Long engagement;
	private String language;
	private String collected_time;
	private String source;
	private String date;
	private String elasticsearch_id;
	private String elasticsearch_routing;
	private String elasticsearch_index;
	private String external_id;
	private String url;
	private String brand;
	private String user;
	
	public Twitter() {}
	
	public Twitter(String id, String interaction_type, String post_id, String content, String rt, String sentiment,
			String service, String collected_from, Boolean archived, AuthorTwitter author, List<String> urls,
			String application, String origin, Boolean replied, Long count, String in_reply_to, Long engagement,
			String language, String collected_time, String source, String date, String elasticsearch_id,
			String elasticsearch_routing, String elasticsearch_index, String external_id, String url, String brand,
			String user) {
		super();
		this.id = id;
		this.interaction_type = interaction_type;
		this.post_id = post_id;
		this.content = content;
		this.rt = rt;
		this.sentiment = sentiment;
		this.service = service;
		this.collected_from = collected_from;
		this.archived = archived;
		this.author = author;
		this.urls = urls;
		this.application = application;
		this.origin = origin;
		this.replied = replied;
		this.count = count;
		this.in_reply_to = in_reply_to;
		this.engagement = engagement;
		this.language = language;
		this.collected_time = collected_time;
		this.source = source;
		this.date = date;
		this.elasticsearch_id = elasticsearch_id;
		this.elasticsearch_routing = elasticsearch_routing;
		this.elasticsearch_index = elasticsearch_index;
		this.external_id = external_id;
		this.url = url;
		this.brand = brand;
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



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getRt() {
		return rt;
	}



	public void setRt(String rt) {
		this.rt = rt;
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



	public String getCollected_from() {
		return collected_from;
	}



	public void setCollected_from(String collected_from) {
		this.collected_from = collected_from;
	}



	public Boolean getArchived() {
		return archived;
	}



	public void setArchived(Boolean archived) {
		this.archived = archived;
	}



	public AuthorTwitter getAuthor() {
		return author;
	}



	public void setAuthor(AuthorTwitter author) {
		this.author = author;
	}



	public List<String> getUrls() {
		return urls;
	}



	public void setUrls(List<String> urls) {
		this.urls = urls;
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



	public Boolean getReplied() {
		return replied;
	}



	public void setReplied(Boolean replied) {
		this.replied = replied;
	}



	public Long getCount() {
		return count;
	}



	public void setCount(Long count) {
		this.count = count;
	}



	public String getIn_reply_to() {
		return in_reply_to;
	}



	public void setIn_reply_to(String in_reply_to) {
		this.in_reply_to = in_reply_to;
	}



	public Long getEngagement() {
		return engagement;
	}



	public void setEngagement(Long engagement) {
		this.engagement = engagement;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public String getCollected_time() {
		return collected_time;
	}



	public void setCollected_time(String collected_time) {
		this.collected_time = collected_time;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
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



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
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
