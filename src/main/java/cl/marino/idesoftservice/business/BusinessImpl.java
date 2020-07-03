package cl.marino.idesoftservice.business;

import cl.marino.idesoftservice.dao.DAO;
import cl.marino.idesoftservice.dao.DAOImpl;
import cl.marino.idesoftservice.entities.LocalDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BusinessImpl implements Business {

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessImpl.class);

    @Autowired
    private DAO dao;

    @Override
    public List<LocalDTO> getLocales(String comuna) {
        LOGGER.info("Filtrando locales por la comuna de: " + comuna);
        return dao.getLocales().stream().filter(getLocalDTOPredicate(comuna)).collect(Collectors.toList());
    }

    private Predicate<LocalDTO> getLocalDTOPredicate(String comuna) {
        return local -> local.getComunaNombre().equals(comuna);
    }

}

