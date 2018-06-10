package com.jpa.entity.project.jpa_entity.models;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLevelEntity is a Querydsl query type for LevelEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLevelEntity extends EntityPathBase<LevelEntity> {

    private static final long serialVersionUID = -842467958L;

    public static final QLevelEntity levelEntity = new QLevelEntity("levelEntity");

    public final StringPath level1 = createString("level1");

    public final StringPath level2 = createString("level2");

    public final StringPath level3 = createString("level3");

    public final StringPath level4 = createString("level4");

    public final NumberPath<Integer> levelId = createNumber("levelId", Integer.class);

    public QLevelEntity(String variable) {
        super(LevelEntity.class, forVariable(variable));
    }

    public QLevelEntity(Path<? extends LevelEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLevelEntity(PathMetadata metadata) {
        super(LevelEntity.class, metadata);
    }

}

