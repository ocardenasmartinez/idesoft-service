package cl.marino.idesoftservice.controllers;

import cl.marino.idesoftservice.business.Business;
import cl.marino.idesoftservice.entities.LocalDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private Business business;

    @GetMapping(path = "/", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<LocalDTO>> getLocales(@RequestParam String comuna) {
        LOGGER.info("Buscando locales de: " + comuna);
        return new ResponseEntity<List<LocalDTO>>(business.getLocales(comuna), HttpStatus.OK);
    }

}
