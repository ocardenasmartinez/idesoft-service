package cl.marino.idesoftservice.business.mocks;

import cl.marino.idesoftservice.business.Business;
import cl.marino.idesoftservice.entities.LocalDTO;

import java.util.ArrayList;
import java.util.List;

public class BusinessMock implements Business {

    @Override
    public List<LocalDTO> getLocales(String argument) {
        return new ArrayList<>();
    }

}
