package com.test.redditrss.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class LinkItem{

	@SerializedName("_href")
	private String href;

	@SerializedName("_rel")
	private String rel;

	@SerializedName("_type")
	private String type;

	public void setHref(String href){
		this.href = href;
	}

	public String getHref(){
		return href;
	}

	public void setRel(String rel){
		this.rel = rel;
	}

	public String getRel(){
		return rel;
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
			"LinkItem{" + 
			"_href = '" + href + '\'' + 
			",_rel = '" + rel + '\'' + 
			",_type = '" + type + '\'' + 
			"}";
		}
}