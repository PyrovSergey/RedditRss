package com.test.redditrss.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Content{

	@SerializedName("__text")
	private String text;

	@SerializedName("_type")
	private String type;

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Content{" + 
			"__text = '" + text + '\'' + 
			",_type = '" + type + '\'' + 
			"}";
		}
}