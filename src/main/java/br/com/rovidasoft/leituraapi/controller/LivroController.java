package br.com.rovidasoft.leituraapi.controller;

import br.com.rovidasoft.leituraapi.model.Livro;
import br.com.rovidasoft.leituraapi.service.LivroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/livro")
public class LivroController {

    LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }

    @GetMapping(value = "/get-all")
    public List<Livro> getAll(){
     return livroService.getAll();
    }

}
