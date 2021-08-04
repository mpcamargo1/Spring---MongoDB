package br.unesp.rc.springtutorialmongodb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 *
 * @author frank
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, includeFieldNames = true)
public class Juridica extends Pessoa {

    @Id
    private String cnpj;

    public Juridica() {
    }

}