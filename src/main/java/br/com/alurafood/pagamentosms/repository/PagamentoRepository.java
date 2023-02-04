package br.com.alurafood.pagamentosms.repository;


import br.com.alurafood.pagamentosms.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
