package cl.marino.idesoftservice.context;

import cl.marino.idesoftservice.business.Business;
import cl.marino.idesoftservice.business.BusinessImpl;
import cl.marino.idesoftservice.dao.DAO;
import cl.marino.idesoftservice.dao.DAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationContext {

    @Bean
    public DAO getDao() {
        return new DAOImpl();
    }

    @Bean
    public Business getBusiness() {
        return new BusinessImpl();
    }

}
