package com.carrental.repository;

import com.carrental.entity.BranchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchRepository extends JpaRepository<BranchEntity, Long> {
    Optional<BranchEntity> findByBranchManagerId(Long managerId);
    // Add custom query methods if needed
}
