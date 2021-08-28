package br.senac.ecommerce.cliente;

public enum TipoCliente {
    F("Físico"),
    J("Juridico");

    private String descricao;

    TipoCliente(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
