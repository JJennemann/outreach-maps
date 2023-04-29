package com.outreachmaps.outreachmaps.data;

import com.outreachmaps.outreachmaps.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

}
