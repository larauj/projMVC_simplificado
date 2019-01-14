package br.com.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.sample.model.Compra;

@Repository
@Transactional
public interface CompraRepository extends CrudRepository<Compra, Long> {
}
