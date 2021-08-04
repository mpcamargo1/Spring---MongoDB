package br.unesp.rc.springtutorialmongodb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author marcospaulo
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco() {
    }

}