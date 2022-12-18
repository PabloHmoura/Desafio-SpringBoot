package br.com.banco.controllers;

import br.com.banco.entidades.Transferencia;
import br.com.banco.services.TransferenciaService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
@RequestMapping
public class TransferenciaController {
    private final TransferenciaService transferenciaService;

    public TransferenciaController(TransferenciaService transferenciaService) {
        this.transferenciaService = transferenciaService;
    }

    @GetMapping("/periodoOperadorETipo")
    public ResponseEntity<List<Transferencia>> buscarTransferenciasPorPeriodoOperadorETipo(
            @RequestParam("dataInicial") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dataInicial,
            @RequestParam("dataFinal") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dataFinal,
            @RequestParam("nomeOperadorTransacao") String nomeOperadorTransacao,
            @RequestParam("tipo") String tipo) {
        List<Transferencia> transferencias = transferenciaService.buscarTransferenciasPorPeriodoOperadorETipo(
                dataInicial, dataFinal, nomeOperadorTransacao, tipo);
        return ResponseEntity.ok(transferencias);
    }
}
