package br.senac.ecommerce.devWeb.Product;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ds_produto")
    private String descricao_produto;

    @Column(name = "ct_product")
    @NotEmpty
    @NotNull
    private String categoria_produto;

    @Column(name = "vl_product")
    @NotEmpty
    @NotNull
    private Integer valor_produto;

    @Column(name = "ps_product")
    @NotEmpty
    @NotNull
    private Double peso_produto;

}
