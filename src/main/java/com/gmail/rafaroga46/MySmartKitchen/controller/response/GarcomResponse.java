package com.gmail.rafaroga46.MySmartKitchen.controller.response;

import lombok.Builder;

@Builder
public record GarcomResponse(Long id,
                             String nome) {
}
