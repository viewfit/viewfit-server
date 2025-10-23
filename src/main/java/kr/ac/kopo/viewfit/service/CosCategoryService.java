package kr.ac.kopo.viewfit.service;

import kr.ac.kopo.viewfit.entity.Categories;

import java.util.List;

public interface CosCategoryService {
    List<Categories> findAll();

    List<Categories> findByParentId(Long parentId);
}
