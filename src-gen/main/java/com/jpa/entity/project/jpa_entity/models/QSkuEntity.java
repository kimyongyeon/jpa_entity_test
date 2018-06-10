package com.jpa.entity.project.jpa_entity.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSkuEntity is a Querydsl query type for SkuEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSkuEntity extends EntityPathBase<SkuEntity> {

    private static final long serialVersionUID = -1203296989L;

    public static final QSkuEntity skuEntity = new QSkuEntity("skuEntity");

    public final NumberPath<Integer> colorId = createNumber("colorId", Integer.class);

    public final NumberPath<Integer> goodsId = createNumber("goodsId", Integer.class);

    public final NumberPath<Integer> materialId = createNumber("materialId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> regDate = createDateTime("regDate", java.sql.Timestamp.class);

    public final StringPath regUser = createString("regUser");

    public final NumberPath<Integer> sizeId = createNumber("sizeId", Integer.class);

    public final NumberPath<Integer> skuId = createNumber("skuId", Integer.class);

    public final StringPath skuName = createString("skuName");

    public final DateTimePath<java.sql.Timestamp> updateDate = createDateTime("updateDate", java.sql.Timestamp.class);

    public final StringPath updateUser = createString("updateUser");

    public QSkuEntity(String variable) {
        super(SkuEntity.class, forVariable(variable));
    }

    public QSkuEntity(Path<? extends SkuEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSkuEntity(PathMetadata metadata) {
        super(SkuEntity.class, metadata);
    }

}

