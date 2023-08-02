package com.example.demo.Repository;

import com.example.demo.Model.ModelRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository extends JpaRepository<ModelRole, Integer> {
}
