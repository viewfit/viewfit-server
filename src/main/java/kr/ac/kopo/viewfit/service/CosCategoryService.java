package kr.ac.kopo.viewfit.service;

import kr.ac.kopo.viewfit.entity.CosCategory;
import kr.ac.kopo.viewfit.entity.Cosmetics;

import java.util.List;

public interface CosCategoryService {
    List<CosCategory> findAll();

    List<CosCategory> findByParentId(Long parentId);
}
