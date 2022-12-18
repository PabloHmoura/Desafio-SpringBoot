package br.com.banco.repository;

import br.com.banco.entidades.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

    List<Transferencia> findByDataTransferenciaBetweenAndNomeOperadorTransacaoAndTipo(
            OffsetDateTime dataInicial, OffsetDateTime dataFinal, String nomeOperadorTransacao, String tipo);
}
