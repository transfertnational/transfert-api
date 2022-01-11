package ma.ensa.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="transfert-service")
public interface ClientFeign {
    //Get all clients from client-service
    @GetMapping("client/")
    List<ClientDTO> findAll();

    //Get a client by id from client-service
    @GetMapping("client/{idClient}")
    ClientDTO getClientById(@PathVariable("id") Long id);
}