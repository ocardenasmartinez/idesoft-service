package cl.marino.idesoftservice.business;

import cl.marino.idesoftservice.dao.DAO;
import cl.marino.idesoftservice.entities.LocalDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class BusinessImpl implements Business {

    @Autowired
    private DAO dao;

    @Override
    public List<LocalDTO> getLocales(String comuna) {
        return dao.getLocales().stream().filter(local -> local.getComunaNombre().equals(comuna)).collect(Collectors.toList());
    }

}
