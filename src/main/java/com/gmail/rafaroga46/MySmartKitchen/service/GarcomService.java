package com.gmail.rafaroga46.MySmartKitchen.service;

import com.gmail.rafaroga46.MySmartKitchen.controller.request.CreateGarcomRequest;
import com.gmail.rafaroga46.MySmartKitchen.controller.response.GarcomResponse;
import com.gmail.rafaroga46.MySmartKitchen.entity.Garcom;
import com.gmail.rafaroga46.MySmartKitchen.mapper.GarcomMapper;
import com.gmail.rafaroga46.MySmartKitchen.repository.GarcomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class GarcomService {

    private final GarcomRepository garcomRepository;


    public GarcomService(GarcomRepository garcomRepository) {
        this.garcomRepository = garcomRepository;

    }


    public GarcomResponse salvar(CreateGarcomRequest request) {
        if (garcomRepository.existsByLogin(request.login())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Login ja cadastrado");

        }
        Garcom novo = GarcomMapper.toEntity(request);
        GarcomResponse atualizado = GarcomMapper.toResponse(garcomRepository.save(novo));

        return atualizado;
    }

    public List<GarcomResponse> listarGarcons() {
        return garcomRepository.findAll()
                .stream()
                .map(GarcomMapper::toResponse)
                .toList();
    }


}
