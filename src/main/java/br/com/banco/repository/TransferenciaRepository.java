package br.com.banco.repository;

import br.com.banco.entidades.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
