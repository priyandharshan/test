package com.docker.dockerdemo.repositories;

import com.docker.dockerdemo.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
