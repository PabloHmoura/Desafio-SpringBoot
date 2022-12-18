package br.com.banco.entidades;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_transferencia", nullable = false)
    private ZonedDateTime dataTransferencia;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String nomeOperadorTransacao;

    @ManyToOne
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;

}
