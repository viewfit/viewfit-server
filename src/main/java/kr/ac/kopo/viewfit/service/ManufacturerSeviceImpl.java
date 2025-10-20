package kr.ac.kopo.viewfit.service;

import jakarta.transaction.Transactional;
import kr.ac.kopo.viewfit.entity.Manufacturer;
import kr.ac.kopo.viewfit.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerSeviceImpl implements ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    @Transactional
    @Override
    public Manufacturer updateManufacturer(Long id, Manufacturer manufacturer) {
        Manufacturer item = manufacturerRepository.findById(id);

        item.setName(manufacturer.getName());
        item.setType(manufacturer.getType());

        manufacturerRepository.save(item);

        return item;
    }

    @Transactional
    @Override
    public void deleteManufacturer(Long id) {

        manufacturerRepository.deleteById(id);
    }
}
