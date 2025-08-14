package com.example.ExercicioRevisao.model.produto;

public record ProductResponseDTO(Long id, String name, double price) {
    public ProductResponseDTO(Produto product){
        this(product.getId(), product.getNome(), product.getPreco());
    }
}
