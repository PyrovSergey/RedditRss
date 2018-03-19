package com.test.redditrss.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("feed")
	private Feed feed;

	public void setFeed(Feed feed){
		this.feed = feed;
	}

	public Feed getFeed(){
		return feed;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"feed = '" + feed + '\'' + 
			"}";
		}
}