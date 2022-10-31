package br.com.rovidasoft.leituraapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "leitura")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Leitura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;
    @Column(name = "data_inicio")
    private LocalDate dataInicioDaLeitura;
    @Column(name = "data_fim")
    private LocalDate dataTerminoDaLeitura;
}
