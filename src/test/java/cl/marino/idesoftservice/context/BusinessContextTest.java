package cl.marino.idesoftservice.context;

import cl.marino.idesoftservice.dao.DAO;
import cl.marino.idesoftservice.dao.mocks.DAOMock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class BusinessContextTest {

    @Bean
    public DAO getDao() {
        return new DAOMock();
    }

}
