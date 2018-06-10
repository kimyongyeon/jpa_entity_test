package com.jpa.entity.project.jpa_entity;

import com.jpa.entity.project.jpa_entity.models.GoodsEntity;
import com.jpa.entity.project.jpa_entity.models.QGoodsEntity;
import com.jpa.entity.project.jpa_entity.repository.GoodsRepo;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaEntityApplication implements CommandLineRunner{

	@Autowired
	GoodsRepo goodsRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaEntityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		QGoodsEntity goods = QGoodsEntity.goodsEntity;
		goods.goodsCode.like("1234");

		BooleanBuilder builder = new BooleanBuilder().and(goods.goodsCode.like("bar%"));
		Iterable<GoodsEntity> goodses = goodsRepo.findAll(builder);

		goodses.forEach(System.out::println);



	}
}
