package cl.marino.idesoftservice.dao;

import cl.marino.idesoftservice.controllers.Controller;
import cl.marino.idesoftservice.entities.LocalDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(DAOImpl.class);

    @Getter
    @Setter
    private static List<LocalDTO> listaLocales = new ArrayList<>();

    public DAOImpl() {
        try {
            cargaLocales();
        } catch (Exception e) {
            LOGGER.error("Hubo un error buscando locales");
        }
    }

    //@Value("${locales-service-url}")
    private String localesURL = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";

    public void cargaLocales() throws Exception {
        LOGGER.info("Buscando locales...");
        ResponseEntity<String> responseEntity = new RestTemplate().getForEntity(localesURL, String.class);
        LOGGER.info("Locales recibidos: ");
        LOGGER.info(responseEntity.getBody());
        listaLocales = new Gson().fromJson(responseEntity.getBody(), new TypeToken<List<LocalDTO>>(){}.getType());
    }

    @Override
    public List<LocalDTO> getLocales() {
        return listaLocales;
    }

}
