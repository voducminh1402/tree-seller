package com.ecommerce.treeseller.controller;

import com.ecommerce.treeseller.dto.tree.ResponseTreeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trees")
public class TreeController {

    @PostMapping
   public ResponseTreeDTO getTree() {
        return new ResponseTreeDTO("1", "Post", 100, true);
   }

    @GetMapping
    public ResponseTreeDTO getTree1() {
        System.out.println("Delted");
        return new ResponseTreeDTO("1", "Get", 100, true);
    }


}
