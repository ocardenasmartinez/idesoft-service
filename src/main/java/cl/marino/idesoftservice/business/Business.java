package cl.marino.idesoftservice.business;

import cl.marino.idesoftservice.entities.LocalDTO;

import java.util.List;

public interface Business {

    public List<LocalDTO> getLocales(String comuna);

}
