package br.com.rovidasoft.leituraapi.controller;

import br.com.rovidasoft.leituraapi.model.Autor;
import br.com.rovidasoft.leituraapi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/autor")
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping(value = "/get-all")
    public List<Autor> getAll(){
        return autorService.getAll();
    }


}
