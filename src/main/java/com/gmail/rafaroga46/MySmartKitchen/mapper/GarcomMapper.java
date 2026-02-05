package com.gmail.rafaroga46.MySmartKitchen.mapper;

import com.gmail.rafaroga46.MySmartKitchen.entity.Garcom;
import com.gmail.rafaroga46.MySmartKitchen.controller.request.CreateGarcomRequest;
import com.gmail.rafaroga46.MySmartKitchen.controller.request.response.GarcomResponse;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

@UtilityClass
public class GarcomMapper {

    public static Garcom toEntity(CreateGarcomRequest request) {
        return Garcom
                .builder()
                .nome(request.nome())
                .login(request.login())
                .senha(request.senha())
                .build();


    }

    public static GarcomResponse toResponse(Garcom entity) {
        return GarcomResponse
                .builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .build();

    }
}
