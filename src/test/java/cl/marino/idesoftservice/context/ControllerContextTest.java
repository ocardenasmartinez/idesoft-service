package cl.marino.idesoftservice.context;

import cl.marino.idesoftservice.business.Business;
import cl.marino.idesoftservice.business.mocks.BusinessMock;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ControllerContextTest {

    @Bean
    public Business getBusiness(){
        return new BusinessMock();
    }

}