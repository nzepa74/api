package com.barcelona_news.dao;

import com.barcelona_news.dto.NewsDto;
import com.barcelona_news.dto.PlayersDto;
import com.barcelona_news.entity.NewsEntity;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by N-Zepa on 13-Feb-18.
 */
public class NewsDao extends AbstractDAO<NewsEntity> {

    SessionFactory sessionFactory;

    public NewsDao(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.sessionFactory = sessionFactory;
    }

    @Transactional()
    public List<NewsDto> getHeadlines() {
        String query = "SELECT NewsID AS newsID, HeadLine AS headLine,NewsContent AS newsContent FROM news";
        return sessionFactory.getCurrentSession().createSQLQuery(query)
                .setResultTransformer(Transformers.aliasToBean(NewsDto.class)).list();
    }

    @Transactional()
    public List<PlayersDto> getPlayersList() {
        String query = "SELECT P.PlayerID AS playerID, \n" +
                " P.LastName AS lastName, \n" +
                " P.FirstName AS firstName,   \n" +
                " P.PlayerPhoto AS playerPhoto,  \n" +
                " PI.DateOfBirth AS dateOfBirth,  \n" +
                " PI.Nationality AS nationality,   \n" +
                " PI.PlayingPosiiton AS playingPosition,  \n" +
                " PI.JerseyNumber AS jerseyNumber,  \n" +
                " PI.PrefferredFoot AS preferredFoot   \n" +
                " FROM player P INNER JOIN playerinfo PI ON P.PlayerID = PI.PlayerID";
        return sessionFactory.getCurrentSession().createSQLQuery(query)
                .setResultTransformer(Transformers.aliasToBean(PlayersDto.class)).list();
    }
}
