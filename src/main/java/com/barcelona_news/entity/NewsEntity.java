package com.barcelona_news.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by N-Zepa on 13-Feb-18.
 */

@Entity
@Table(name = "news")
@NamedQueries({
        @NamedQuery(name = "NewsEntity.findAll", query = "from NewsEntity c")
})
public class NewsEntity {

    //region private variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty
    private Integer NewsID;

    @Column(name = "HeadLine")
    @JsonProperty
    private String headLine;

    @Column(name = "NewsContent")
    @JsonProperty
    private String newsContent;
    //endregion

    //region setters and getters
    public Integer getNewsID() {
        return NewsID;
    }

    public void setNewsID(Integer newsID) {
        NewsID = newsID;
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
