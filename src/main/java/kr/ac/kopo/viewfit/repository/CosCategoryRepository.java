package kr.ac.kopo.viewfit.repository;

import kr.ac.kopo.viewfit.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;


import java.util.List;

@EnableJpaRepositories
public interface CosCategoryRepository extends JpaRepository<Categories, Long> {

    @Query("SELECT c FROM Categories c ORDER BY c.id")
    List<Categories> findAll();

    @Query("SELECT c FROM Categories c WHERE c.id = :parentId ORDER BY c.id")
    List<Categories> findByParentId(@Param("parentId") Long parentId);
}
