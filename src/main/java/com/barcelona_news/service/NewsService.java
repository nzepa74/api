package com.barcelona_news.service;

import com.barcelona_news.dao.NewsDao;
import com.barcelona_news.dto.NewsDto;
import com.barcelona_news.dto.PlayersDto;

import java.util.List;

/**
 * Created by N-Zepa on 13-Feb-18.
 */
public class NewsService {
    private NewsDao newsDao;

    public NewsService(NewsDao newsDao) {
        this.newsDao = newsDao;
    }

    public List<NewsDto> getHeadlines() {
        return newsDao.getHeadlines();
    }

    public List<PlayersDto> getPlayersList() {

        return newsDao.getPlayersList();
    }
}
