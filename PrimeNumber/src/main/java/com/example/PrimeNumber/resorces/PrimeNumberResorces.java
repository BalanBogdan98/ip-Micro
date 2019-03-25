package com.example.PrimeNumber.resorces;

import com.example.PrimeNumber.models.Nrp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/prim")

public class PrimeNumberResorces {
    @RequestMapping("/{userId}")
    public String getCatalog(@PathVariable("userId") String userId){
        if(Integer.valueOf(userId)<0)
            return "no";

        for(int i=2;i<=Integer.valueOf(userId)/2;i++)
            if(Integer.valueOf(userId)%i==0)
            {return "no";}

        return "yes";

    }
}