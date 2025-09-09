package kr.ac.kopo.viewfit.repository;


import kr.ac.kopo.viewfit.entity.Cosmetics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CosmeticsRepository extends JpaRepository<Cosmetics, Long> {

    List<Cosmetics> findAll();

}
