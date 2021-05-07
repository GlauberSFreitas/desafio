package com.mv.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mv.desafio.model.Estabelecimento;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	@Query(value = "select * from tb_cnesativos e where e.uf like %?1%", nativeQuery = true)
	List<Estabelecimento> findByUF(String uf);

	@Query(value = "select * from tb_cnesativos e where e.tipo_unidade like %?1%", nativeQuery = true)
	List<Estabelecimento> findByTipo(String tipo);
	
	@Query(value = "select * from tb_cnesativos e where e.cep = ?1", nativeQuery = true)
	Estabelecimento findByCep(Long cep);
}
