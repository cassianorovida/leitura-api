package br.com.rovidasoft.leituraapi.service;

import br.com.rovidasoft.leituraapi.model.Autor;
import br.com.rovidasoft.leituraapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public List<Autor> getAll() {
        return autorRepository.findAll();
    }
}
