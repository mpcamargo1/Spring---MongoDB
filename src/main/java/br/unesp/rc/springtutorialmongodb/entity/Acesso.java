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
public class Acesso {

    private String usuario;
    private String senha;

    public Acesso() {
    }

}