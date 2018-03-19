package com.test.redditrss.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class EntryItem{

	@SerializedName("author")
	private Author author;

	@SerializedName("link")
	private Link link;

	@SerializedName("id")
	private String id;

	@SerializedName("category")
	private Category category;

	@SerializedName("title")
	private String title;

	@SerializedName("updated")
	private String updated;

	@SerializedName("content")
	private Content content;

	public void setAuthor(Author author){
		this.author = author;
	}

	public Author getAuthor(){
		return author;
	}

	public void setLink(Link link){
		this.link = link;
	}

	public Link getLink(){
		return link;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	public void setContent(Content content){
		this.content = content;
	}

	public Content getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"EntryItem{" + 
			"author = '" + author + '\'' + 
			",link = '" + link + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",title = '" + title + '\'' + 
			",updated = '" + updated + '\'' + 
			",content = '" + content + '\'' + 
			"}";
		}
}