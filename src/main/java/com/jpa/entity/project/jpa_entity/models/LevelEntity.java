package com.jpa.entity.project.jpa_entity.models;

import javax.persistence.*;

@Entity
@Table(name = "LEVEL", schema = "test", catalog = "")
public class LevelEntity {
    private int levelId;
    private String level1;
    private String level2;
    private String level3;
    private String level4;

    @Id
    @Column(name = "LEVEL_ID")
    public int getLevelId() {
        return levelId;
    }

    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    @Basic
    @Column(name = "LEVEL1")
    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    @Basic
    @Column(name = "LEVEL2")
    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    @Basic
    @Column(name = "LEVEL3")
    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    @Basic
    @Column(name = "LEVEL4")
    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LevelEntity that = (LevelEntity) o;

        if (levelId != that.levelId) return false;
        if (level1 != null ? !level1.equals(that.level1) : that.level1 != null) return false;
        if (level2 != null ? !level2.equals(that.level2) : that.level2 != null) return false;
        if (level3 != null ? !level3.equals(that.level3) : that.level3 != null) return false;
        if (level4 != null ? !level4.equals(that.level4) : that.level4 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelId;
        result = 31 * result + (level1 != null ? level1.hashCode() : 0);
        result = 31 * result + (level2 != null ? level2.hashCode() : 0);
        result = 31 * result + (level3 != null ? level3.hashCode() : 0);
        result = 31 * result + (level4 != null ? level4.hashCode() : 0);
        return result;
    }
}
