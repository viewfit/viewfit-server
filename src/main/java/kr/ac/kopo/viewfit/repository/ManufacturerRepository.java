package kr.ac.kopo.viewfit.repository;

import kr.ac.kopo.viewfit.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerRepository  extends JpaRepository<Manufacturer, Integer> {


    List<Manufacturer> findAll();

    Manufacturer findById(Long id);

    void deleteById(Long id);
}
