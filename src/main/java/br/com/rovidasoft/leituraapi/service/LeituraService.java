package br.com.rovidasoft.leituraapi.service;

import br.com.rovidasoft.leituraapi.model.Leitura;
import br.com.rovidasoft.leituraapi.repository.LeituraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeituraService {

    LeituraRepository leituraRepository;

    public LeituraService(LeituraRepository leituraRepository) {
        this.leituraRepository = leituraRepository;
    }

    public List<Leitura> getAll() {
        return leituraRepository.findAll();
    }

}
