package com.barcelona_news.resources;

import com.barcelona_news.dto.NewsDto;
import com.barcelona_news.dto.PlayersDto;
import com.barcelona_news.service.NewsService;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by N-Zepa on 13-Feb-18.
 */

@Path("/restApi")
@Produces(MediaType.APPLICATION_JSON)
public class NewsResources {

    private NewsService newsService;

    public NewsResources(NewsService newsService) {
        this.newsService = newsService;
    }

    @GET
    @UnitOfWork
    @Path("/news")
    public String getItemCategory() {
        return "message here.";
    }

    @GET
    @UnitOfWork
    @Path("/getHeadlines")
    public List<NewsDto> getHeadlines() {
        return  newsService.getHeadlines();
    }
    @GET
    @UnitOfWork
    @Path("/getPlayersList")
    public List<PlayersDto> getPlayersList() {

        return  newsService.getPlayersList();
    }

}
