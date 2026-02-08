package com.gmail.rafaroga46.MySmartKitchen.controller;

import com.gmail.rafaroga46.MySmartKitchen.controller.request.CreateGarcomRequest;
import com.gmail.rafaroga46.MySmartKitchen.controller.response.GarcomResponse;
import com.gmail.rafaroga46.MySmartKitchen.entity.Garcom;
import com.gmail.rafaroga46.MySmartKitchen.mapper.GarcomMapper;
import com.gmail.rafaroga46.MySmartKitchen.service.GarcomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mysmartkitchen/garcom")
public class GarcomController {

    private final GarcomService garcomService;

    public GarcomController(GarcomService garcomService) {
        this.garcomService = garcomService;
    }

    @PostMapping("/criar")
    public ResponseEntity<GarcomResponse> salvarGarcom(@RequestBody CreateGarcomRequest request) {
        GarcomResponse garcomAtualizado = garcomService.salvar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(garcomAtualizado);

    }

    @GetMapping("/listar")
    public ResponseEntity<List<GarcomResponse>> listarGarcons() {
       return ResponseEntity.ok(garcomService.listarGarcons());


    }
}
