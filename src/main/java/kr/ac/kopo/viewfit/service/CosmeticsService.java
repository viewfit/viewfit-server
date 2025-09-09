package kr.ac.kopo.viewfit.service;

import kr.ac.kopo.viewfit.entity.Cosmetics;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CosmeticsService {

    List<Cosmetics> findAll();
}
