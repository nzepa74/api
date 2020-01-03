package com.barcelona_news;

import com.barcelona_news.configuration.CustomConfig;
import com.barcelona_news.dao.NewsDao;
import com.barcelona_news.entity.NewsEntity;
import com.barcelona_news.resources.NewsResources;
import com.barcelona_news.service.NewsService;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.log4j.Logger;

/**
 * Created by N-Zepa on 13-Feb-18.
 */
public class BarcelonaNewsMainClass extends Application<CustomConfig> {

    final static Logger logger = Logger.getLogger(BarcelonaNewsMainClass.class);

    /**
     * Hibernate bundle.
     */
    private final HibernateBundle<CustomConfig> hibernateBundle
            = new HibernateBundle<CustomConfig>(NewsEntity.class) {

        public DataSourceFactory getDataSourceFactory(
                CustomConfig configuration
        ) {
            return configuration.getDataSourceFactory();
        }
    };

    public static void main(String args[]) {
        try {
            new BarcelonaNewsMainClass().run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Ngawang Zepa");
    }

    @Override
    public void initialize(
            final Bootstrap<CustomConfig> bootstrap) {
        bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(CustomConfig customConfig, Environment environment) throws Exception {
        final NewsDao newsDao = new NewsDao(hibernateBundle.getSessionFactory());

        final NewsService newsService = new NewsService(newsDao);
        environment.jersey().register(new NewsResources(newsService));
    }
}
