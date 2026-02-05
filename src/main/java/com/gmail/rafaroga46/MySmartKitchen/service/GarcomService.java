package com.gmail.rafaroga46.MySmartKitchen.service;

import com.gmail.rafaroga46.MySmartKitchen.repository.GarcomRepository;
import org.springframework.stereotype.Service;

@Service
public class GarcomService {

    private GarcomRepository garcomRepository;

    public GarcomService(GarcomRepository garcomRepository) {
        this.garcomRepository = garcomRepository;
    }
}
