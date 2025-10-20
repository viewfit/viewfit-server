package kr.ac.kopo.viewfit.controller;

import kr.ac.kopo.viewfit.entity.Manufacturer;
import kr.ac.kopo.viewfit.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menufacturer")
public class MenufacturerController {

    @Autowired
    ManufacturerService manufacturerService;

    @GetMapping
    public List<Manufacturer> findAll() {
        return manufacturerService.findAll();
    }

    @PostMapping
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerService.createManufacturer(manufacturer);
    }

    @PutMapping("/{id}")
    public Manufacturer updatgeManufacturer(@RequestBody Manufacturer manufacturer, @PathVariable Long id) {

        return manufacturerService.updateManufacturer(id, manufacturer);
    }

    @DeleteMapping("/{id}")
    public void deleteManufacturer(@PathVariable Long id) {

         manufacturerService.deleteManufacturer(id);
    }



}

