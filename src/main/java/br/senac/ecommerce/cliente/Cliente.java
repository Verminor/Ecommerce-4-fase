package br.senac.ecommerce.cliente;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "person")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;
    @Column(name = "nm_cliente")
    @NotNull
    @NotEmpty
    private String nome;
    @Column(name = "nm_social")
    private String nomeSocial;
    @Column(name = "ds_cpfcnpj")
    @NotNull
    @NotEmpty
    private String cpfCnpj;
    @Column(name = "ds_endereco")
    @NotNull
    @NotEmpty
    private String endereco;
    @Column(name = "ds_email")
    @NotNull
    @NotEmpty
    private String email;
    @Column(name = "tp_pessoa")
    @NotNull
    @NotEmpty
    private TipoCliente tipo;
}
