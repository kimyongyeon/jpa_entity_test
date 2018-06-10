package com.jpa.entity.project.jpa_entity.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "SKU", schema = "test", catalog = "")
public class SkuEntity {
    private int skuId;
    private String skuName;
    private Integer goodsId;
    private Integer sizeId;
    private Integer colorId;
    private Integer materialId;
    private Timestamp regDate;
    private String regUser;
    private Timestamp updateDate;
    private String updateUser;

    @Id
    @Column(name = "SKU_ID")
    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "SKU_NAME")
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "GOODS_ID")
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "SIZE_ID")
    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    @Basic
    @Column(name = "COLOR_ID")
    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    @Basic
    @Column(name = "MATERIAL_ID")
    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Basic
    @Column(name = "REG_DATE")
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "REG_USER")
    public String getRegUser() {
        return regUser;
    }

    public void setRegUser(String regUser) {
        this.regUser = regUser;
    }

    @Basic
    @Column(name = "UPDATE_DATE")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "UPDATE_USER")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkuEntity skuEntity = (SkuEntity) o;

        if (skuId != skuEntity.skuId) return false;
        if (skuName != null ? !skuName.equals(skuEntity.skuName) : skuEntity.skuName != null) return false;
        if (goodsId != null ? !goodsId.equals(skuEntity.goodsId) : skuEntity.goodsId != null) return false;
        if (sizeId != null ? !sizeId.equals(skuEntity.sizeId) : skuEntity.sizeId != null) return false;
        if (colorId != null ? !colorId.equals(skuEntity.colorId) : skuEntity.colorId != null) return false;
        if (materialId != null ? !materialId.equals(skuEntity.materialId) : skuEntity.materialId != null) return false;
        if (regDate != null ? !regDate.equals(skuEntity.regDate) : skuEntity.regDate != null) return false;
        if (regUser != null ? !regUser.equals(skuEntity.regUser) : skuEntity.regUser != null) return false;
        if (updateDate != null ? !updateDate.equals(skuEntity.updateDate) : skuEntity.updateDate != null) return false;
        if (updateUser != null ? !updateUser.equals(skuEntity.updateUser) : skuEntity.updateUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = skuId;
        result = 31 * result + (skuName != null ? skuName.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (sizeId != null ? sizeId.hashCode() : 0);
        result = 31 * result + (colorId != null ? colorId.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (regUser != null ? regUser.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        return result;
    }
}
