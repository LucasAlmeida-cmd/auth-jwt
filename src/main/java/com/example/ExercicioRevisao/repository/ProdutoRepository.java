package com.example.ExercicioRevisao.repository;

import com.example.ExercicioRevisao.model.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
