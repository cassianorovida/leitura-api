package br.com.rovidasoft.leituraapi.repository;

import br.com.rovidasoft.leituraapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
