package com.example.demodocker;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    @Transactional(rollbackOn = Exception.class)
    public void demoTransaction(){
        Optional<Product> product = productRepository.findById(1L);
        product.orElseThrow(
            () -> new IllegalStateException()
        );
        Product savedProduct =product.get();
        savedProduct.setName("hung");
        productRepository.save(savedProduct);
    }

}
