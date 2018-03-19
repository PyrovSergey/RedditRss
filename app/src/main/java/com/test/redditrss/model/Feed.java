package com.test.redditrss.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Feed implements Serializable {

    @SerializedName("entry")
    private List<EntryItem> entry;

    @SerializedName("subtitle")
    private String subtitle;

    @SerializedName("_xmlns")
    private String xmlns;

    @SerializedName("icon")
    private String icon;

    @SerializedName("link")
    private List<LinkItem> link;

    @SerializedName("logo")
    private String logo;

    @SerializedName("id")
    private String id;

    @SerializedName("category")
    private Category category;

    @SerializedName("title")
    private String title;

    @SerializedName("updated")
    private String updated;

    public void setEntry(List<EntryItem> entry) {
        this.entry = entry;
    }

    public List<EntryItem> getEntry() {
        return entry;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setLink(List<LinkItem> link) {
        this.link = link;
    }

    public List<LinkItem> getLink() {
        return link;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return
                "Feed{" +
                        "entry = '" + entry + '\'' +
                        ",subtitle = '" + subtitle + '\'' +
                        ",_xmlns = '" + xmlns + '\'' +
                        ",icon = '" + icon + '\'' +
                        ",link = '" + link + '\'' +
                        ",logo = '" + logo + '\'' +
                        ",id = '" + id + '\'' +
                        ",category = '" + category + '\'' +
                        ",title = '" + title + '\'' +
                        ",updated = '" + updated + '\'' +
                        "}";
    }
}