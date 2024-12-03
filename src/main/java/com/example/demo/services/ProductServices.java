package com.example.demo.services;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServices {

    private final ProductRepository productRepository;

    // Leer todos los productos
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Leer producto por ID
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    // Crear o actualizar producto
    public Product saveProduct(Product product) {
        if (product.getStock() == null){
            product.setStock(0);//asigna un valor predeterminado por si no se especifica
        }
        return productRepository.save(product);
    }

    // Eliminar producto
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
