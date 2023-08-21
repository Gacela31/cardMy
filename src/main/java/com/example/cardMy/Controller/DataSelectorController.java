package com.example.cardMy.Controller;

import com.example.cardMy.DTo.DataSelectorDTO;
import com.example.cardMy.Service.DataSelectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/DataSelector")
@CrossOrigin(origins = "*")

public class DataSelectorController {

    @Autowired
    private DataSelectorService dataSelectorService;

    //obtener los datos de una persona con un id especifico
    @GetMapping("/{id}")
    public ResponseEntity <DataSelectorDTO> searchById (@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(dataSelectorService.searchById(id));
    }

    //registrar los datos de una nueva persona
    @PostMapping()
    public ResponseEntity<DataSelectorDTO> registerData(@RequestBody DataSelectorDTO dataSelectorDTO){
        return new ResponseEntity<>(dataSelectorService.registerData(dataSelectorDTO), HttpStatus.CREATED);
    }
}
