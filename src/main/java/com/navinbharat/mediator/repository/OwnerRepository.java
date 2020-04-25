package com.navinbharat.mediator.repository;

import com.navinbharat.mediator.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
