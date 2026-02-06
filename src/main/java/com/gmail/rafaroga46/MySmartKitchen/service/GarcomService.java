package com.gmail.rafaroga46.MySmartKitchen.service;

import com.gmail.rafaroga46.MySmartKitchen.controller.request.CreateGarcomRequest;
import com.gmail.rafaroga46.MySmartKitchen.controller.request.response.GarcomResponse;
import com.gmail.rafaroga46.MySmartKitchen.entity.Garcom;
import com.gmail.rafaroga46.MySmartKitchen.mapper.GarcomMapper;
import com.gmail.rafaroga46.MySmartKitchen.repository.GarcomRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class GarcomService {

    private final  GarcomRepository garcomRepository;
    private final GarcomMapper mapper;

    public GarcomService(GarcomRepository garcomRepository, GarcomMapper mapper) {
        this.garcomRepository = garcomRepository;
        this.mapper = mapper;
    }


    public GarcomResponse criarGarcom(CreateGarcomRequest request) {
        return GarcomMapper.toResponse(
                garcomRepository.save(GarcomMapper.toEntity(request)));

    }

}
