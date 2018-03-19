package com.test.redditrss.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Author{

	@SerializedName("name")
	private String name;

	@SerializedName("uri")
	private String uri;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	@Override
 	public String toString(){
		return 
			"Author{" + 
			"name = '" + name + '\'' + 
			",uri = '" + uri + '\'' + 
			"}";
		}
}