package com.gestion.gestion.TaskRepositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.gestion.Modelo.Task;

public interface TaskRepository extends JpaRepository< Task ,Long> {
    
}
