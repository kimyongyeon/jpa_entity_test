package com.jpa.entity.project.jpa_entity.repository;

import com.jpa.entity.project.jpa_entity.models.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * 수정포인트.
 */
public interface GoodsRepo extends JpaRepository<GoodsEntity, Long>, QuerydslPredicateExecutor<GoodsEntity> {
}
