package cl.marino.idesoftservice.business.tests;

import cl.marino.idesoftservice.business.Business;
import cl.marino.idesoftservice.context.BusinessContextTest;
import cl.marino.idesoftservice.context.ControllerContextTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BusinessContextTest.class)
public class BusinessTest {

    public static final String RECOLETA = "RECOLETA";

    @Autowired
    private Business business;

    @Test
    public void testBusiness() {
        assertThat(business.getLocales(RECOLETA)).isNotNull();
    }

}
