package com.jpa.entity.project.jpa_entity;

import com.jpa.entity.project.jpa_entity.models.GoodsEntity;
import com.jpa.entity.project.jpa_entity.repository.GoodsRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaEntityApplicationTests {

	@Autowired
	GoodsRepo goodsRepo;

	@Before
	public void setUp() throws Exception {
		goodsRepo.save(new GoodsEntity(1, "goods1", "2018-06-10", "admin", "", "admin"));
		goodsRepo.save(new GoodsEntity(2, "goods2", "2018-06-10", "admin", "", "admin"));
		goodsRepo.save(new GoodsEntity(3, "goods3", "2018-06-10", "admin", "", "admin"));
		goodsRepo.save(new GoodsEntity(4, "goods4", "2018-06-10", "admin", "", "admin"));
	}

	@Test
	public void testGood() {

	}

	@Test
	public void contextLoads() {
		goodsRepo.findAll().forEach(g -> System.out.println(g.getGoodsCode()));

	}

}
