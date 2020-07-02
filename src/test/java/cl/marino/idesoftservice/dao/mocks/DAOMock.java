package cl.marino.idesoftservice.dao.mocks;

import cl.marino.idesoftservice.dao.DAO;
import cl.marino.idesoftservice.entities.LocalDTO;

import java.util.ArrayList;
import java.util.List;

public class DAOMock implements DAO {
    @Override
    public List<LocalDTO> getLocales() {
        return new ArrayList<>();
    }
}
