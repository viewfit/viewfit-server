package kr.ac.kopo.viewfit.repository;

import kr.ac.kopo.viewfit.entity.CosCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CosCategoryRepository extends JpaRepository<CosCategory, Long> {

    List<CosCategory> findAll();
}
