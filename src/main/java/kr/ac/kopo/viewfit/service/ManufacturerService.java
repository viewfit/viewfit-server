package kr.ac.kopo.viewfit.service;

import kr.ac.kopo.viewfit.entity.Manufacturer;

import java.util.List;

public interface ManufacturerService {


    List<Manufacturer> findAll();

    Manufacturer createManufacturer(Manufacturer manufacturer);

    Manufacturer updateManufacturer(Long id, Manufacturer manufacturer);

    void deleteManufacturer(Long id);
}
