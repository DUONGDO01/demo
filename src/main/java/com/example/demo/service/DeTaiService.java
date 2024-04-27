package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeTaiService {

    @Autowired
    DeTaiRepository deTaiRepository;

    public void getAll() {
//        TBLDeTai deTai = new TBLDeTai();
//        deTai.setTendt("test");
//        deTai.setMadt("test");
//        deTai.setKinhphi(100);
//        deTai.setNoithuctap("ha noi");
//        deTaiRepository.save(deTai);
        List<TBLDeTai> deTais = deTaiRepository.getAllDetai();

        System.out.println(deTais.size());
    }

}
