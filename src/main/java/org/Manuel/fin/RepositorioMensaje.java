/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Manuel.fin;

import org.Manuel.fin.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author z0s0xp
 */
public interface RepositorioMensaje extends MongoRepository<Mensaje,String>{
    
}
