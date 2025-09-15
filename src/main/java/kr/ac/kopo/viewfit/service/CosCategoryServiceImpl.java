package kr.ac.kopo.viewfit.service;

import kr.ac.kopo.viewfit.entity.CosCategory;
import kr.ac.kopo.viewfit.entity.Cosmetics;
import kr.ac.kopo.viewfit.repository.CosCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CosCategoryServiceImpl implements CosCategoryService {

    @Autowired
    CosCategoryRepository cosCategoryRepository;

    @Override
    public List<CosCategory> findAll() {
        return cosCategoryRepository.findAll();
    }
}
