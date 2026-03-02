package com.mauriciojdk.servicetoday.services;
import com.mauriciojdk.servicetoday.dtos.ClientDTO;
import com.mauriciojdk.servicetoday.models.Client;
import com.mauriciojdk.servicetoday.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(ClientDTO dto) {
        Client client = new Client();
        client.setName(dto.getName());
        client.setEmail(dto.getEmail());
        client.setNumber(dto.getNumber());

        return clientRepository.save(client);
    }

}
