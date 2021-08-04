/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.springtutorialmongodb.repository;

import br.unesp.rc.springtutorialmongodb.entity.Fisica;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FisicaRepository extends MongoRepository<Fisica, Long> {

    Fisica findByCpf(String cpf);

    void deleteByCpf(String cpf);
}