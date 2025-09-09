package kr.ac.kopo.viewfit.controller;

import kr.ac.kopo.viewfit.entity.Cosmetics;
import kr.ac.kopo.viewfit.service.CosmeticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class RootController {

    @Autowired
    CosmeticsService cosmeticsService;

    @GetMapping()
    @ResponseBody
    public List<Cosmetics> index() {
        System.out.println("main 접근");
        
        return cosmeticsService.findAll();
    }
}
