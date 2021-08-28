package br.senac.ecommerce.devWeb.Product;


import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product createProduct){
        return this.productRepository.save(createProduct);
    }

    public Iterable<Product> getListProducts(Predicate predicate, Pageable pageable){
        return this.productRepository.findAll(predicate, pageable);
    }

    public Product searchProductId(Integer id){
        return this.productRepository.findById(id).get();
    }
}
