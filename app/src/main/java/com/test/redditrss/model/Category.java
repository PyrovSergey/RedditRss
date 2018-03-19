package com.test.redditrss.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Category{

	@SerializedName("_term")
	private String term;

	@SerializedName("_label")
	private String label;

	public void setTerm(String term){
		this.term = term;
	}

	public String getTerm(){
		return term;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	@Override
 	public String toString(){
		return 
			"Category{" + 
			"_term = '" + term + '\'' + 
			",_label = '" + label + '\'' + 
			"}";
		}
}