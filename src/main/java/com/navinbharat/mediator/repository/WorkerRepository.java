package com.navinbharat.mediator.repository;

import com.navinbharat.mediator.domain.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
