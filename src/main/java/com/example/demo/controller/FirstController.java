package com.example.demo.controller;

import com.example.demo.entity.TBLKhoa;
import com.example.demo.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstController {
    @Autowired
    KhoaRepository khoaRepository;

    @GetMapping("/test jpa")
    public String getAll(Model model) {
        List<TBLKhoa> listKhoa = khoaRepository.getAll();
        model.addAttribute("listKhoa", listKhoa);

        String[] headers = new String[]{"ten", "tuoi", "nghe nghiep"};

        model.addAttribute("headers", headers);
        return "home";
    }
}
