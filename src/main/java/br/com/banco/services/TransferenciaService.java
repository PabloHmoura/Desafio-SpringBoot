package br.com.banco.services;

import br.com.banco.entidades.Transferencia;
import br.com.banco.repository.TransferenciaRepository;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class TransferenciaService {

    private final TransferenciaRepository transferenciaRepository;

    public TransferenciaService(TransferenciaRepository transferenciaRepository) {
        this.transferenciaRepository = transferenciaRepository;
    }

    public List<Transferencia> buscarTransferenciasPorPeriodoOperadorETipo(
            OffsetDateTime dataInicial, OffsetDateTime dataFinal, String nomeOperadorTransacao, String tipo) {
        return transferenciaRepository.findByDataTransferenciaBetweenAndNomeOperadorTransacaoAndTipo(
                dataInicial, dataFinal, nomeOperadorTransacao, tipo);
    }
}
