package com.tar.description.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tar.description.model.ProductDescription;
import com.tar.description.repository.ProductDescriptionRepository;

@RestController
@RequestMapping("/descriptions")
public class ProductDescriptionController {

    @Autowired
    private ProductDescriptionRepository descriptionRepository;

   
    @GetMapping
    public List<ProductDescription> getAllDescriptions() {
        return descriptionRepository.findAll();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<ProductDescription> getDescriptionById(@PathVariable Long id) {
        Optional<ProductDescription> description = descriptionRepository.findById(id);
        if (description.isPresent()) {
            return ResponseEntity.ok(description.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

   
    @PostMapping
    public ResponseEntity<ProductDescription> createDescription(@RequestBody ProductDescription description) {
        ProductDescription savedDescription = descriptionRepository.save(description);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDescription);
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<ProductDescription> updateDescription(@PathVariable Long id, @RequestBody ProductDescription descriptionDetails) {
        Optional<ProductDescription> optionalDescription = descriptionRepository.findById(id);
        if (optionalDescription.isPresent()) {
            ProductDescription description = optionalDescription.get();
            description.setBrand(descriptionDetails.getBrand());
            description.setModel(descriptionDetails.getModel());
            description.setPrice(descriptionDetails.getPrice());
            ProductDescription updatedDescription = descriptionRepository.save(description);
            return ResponseEntity.ok(updatedDescription);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDescription(@PathVariable Long id) {
        descriptionRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
