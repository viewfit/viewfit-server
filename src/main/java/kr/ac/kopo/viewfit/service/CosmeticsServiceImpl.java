package kr.ac.kopo.viewfit.service;

import kr.ac.kopo.viewfit.entity.Cosmetics;
import kr.ac.kopo.viewfit.repository.CosmeticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CosmeticsServiceImpl implements CosmeticsService {

    @Autowired
    private CosmeticsRepository cosmeticsRepository;

    @Override
    public List<Cosmetics> findAll() {
        return cosmeticsRepository.findAll();
    }
}
