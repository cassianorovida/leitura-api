package br.com.rovidasoft.leituraapi.repository;

import br.com.rovidasoft.leituraapi.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeituraRepository extends JpaRepository<Leitura, Long> {
}
