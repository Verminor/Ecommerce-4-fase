package br.senac.ecommerce.devWeb.Product;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>, QuerydslPredicateExecutor<Product> {
}
