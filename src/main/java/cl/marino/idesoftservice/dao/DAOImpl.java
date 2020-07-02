package cl.marino.idesoftservice.dao;

import cl.marino.idesoftservice.entities.LocalDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class DAOImpl implements DAO {

    @Getter
    @Setter
    private static List<LocalDTO> listaLocales;

    public DAOImpl() {
        cargaLocales();
    }

    //@Value("${locales-service-url}")
    private String localesURL = "https://farmanet.minsal.cl/maps/index.php/ws/getLocalesRegion?id_region=7";

    public void cargaLocales() {
        ResponseEntity<String> responseEntity = new RestTemplate().getForEntity(localesURL, String.class);
        listaLocales = new Gson().fromJson(responseEntity.getBody(), new TypeToken<List<LocalDTO>>(){}.getType());
    }

    @Override
    public List<LocalDTO> getLocales() {
        return listaLocales;
    }

}
