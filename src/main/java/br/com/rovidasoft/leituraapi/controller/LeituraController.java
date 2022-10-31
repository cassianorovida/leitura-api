package br.com.rovidasoft.leituraapi.controller;

import br.com.rovidasoft.leituraapi.model.Leitura;
import br.com.rovidasoft.leituraapi.service.LeituraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/leitura")
public class LeituraController {

    @Autowired
    LeituraService leituraService;

    @GetMapping(value = "/get-all")
    public List<Leitura> getLeitura() {
        return leituraService.getAll();
    }
}
