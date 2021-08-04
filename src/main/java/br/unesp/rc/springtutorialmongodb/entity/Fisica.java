package br.unesp.rc.springtutorialmongodb.entity;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 *
 * @author marcospaulo
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper = true, includeFieldNames = true)
public class Fisica extends Pessoa {

    @Id
    private String cpf;
    private Date dataNascimento;

    public Fisica() {
    }

}