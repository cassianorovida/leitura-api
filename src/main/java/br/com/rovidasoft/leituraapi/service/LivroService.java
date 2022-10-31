package br.com.rovidasoft.leituraapi.service;

import br.com.rovidasoft.leituraapi.model.Livro;
import br.com.rovidasoft.leituraapi.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> getAll(){
     return livroRepository.findAll();
    }

}
