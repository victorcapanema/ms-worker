package com.force.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.force.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
