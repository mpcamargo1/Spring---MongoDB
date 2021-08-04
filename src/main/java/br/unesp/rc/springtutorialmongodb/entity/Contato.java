package br.unesp.rc.springtutorialmongodb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author frank
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Contato {

    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato() {
    }

}