package com.barcelona_news.dto;

/**
 * Created by N-Zepa on 13-Feb-18.
 */
public class NewsDto {
    //region private variables
    private Integer newsID;
    private String headLine;
    private String newsContent;
    //endregion

    //region setters and getters
    public Integer getNewsID() {
        return newsID;
    }

    public void setNewsID(Integer newsID) {
        this.newsID = newsID;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    //endregion
}
