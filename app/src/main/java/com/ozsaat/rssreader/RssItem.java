package com.ozsaat.rssreader;

/**
 * Created by Oz on 07/10/2014.
 */
public class RssItem {

    private String title;
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;

    }

    @Override
    public String toString() {
        return title;
    }
}
