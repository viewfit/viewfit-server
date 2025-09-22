package kr.ac.kopo.viewfit.controller;

import kr.ac.kopo.viewfit.entity.CosCategory;
import kr.ac.kopo.viewfit.entity.Cosmetics;
import kr.ac.kopo.viewfit.service.CosCategoryService;
import kr.ac.kopo.viewfit.service.CosmeticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("")
public class RootController {

    @Autowired
    CosmeticsService cosmeticsService;

    @Autowired
    CosCategoryService cosCategoryService;

    @GetMapping()
    public List<Cosmetics> index() {
        System.out.println("main 접근");
        
        return cosmeticsService.findAll();
    }

    @GetMapping("/categories")
    public List<CosCategory> categories() {
        return cosCategoryService.findAll();
    }

    @GetMapping("categories/{parent_id}")
    public List<CosCategory> categories(@PathVariable("parent_id") Long parent_id) {
        return cosCategoryService.findByParentId(parent_id);
    }
}
