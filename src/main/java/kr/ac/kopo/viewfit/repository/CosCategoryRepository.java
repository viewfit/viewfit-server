package kr.ac.kopo.viewfit.repository;

import kr.ac.kopo.viewfit.entity.CosCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;


import java.util.List;

@EnableJpaRepositories
public interface CosCategoryRepository extends JpaRepository<CosCategory, Long> {

    List<CosCategory> findAll();

    @Query("SELECT c FROM CosCategory c WHERE c.parentCategory.id = :parentId ")
    List<CosCategory> findByParentId(@Param("parentId") Long parentId);
}
