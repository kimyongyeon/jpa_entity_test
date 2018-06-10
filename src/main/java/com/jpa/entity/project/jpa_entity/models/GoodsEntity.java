package com.jpa.entity.project.jpa_entity.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Goods", schema = "test", catalog = "")
public class GoodsEntity {
    private int goodsId;
    private String goodsCode;
    @Column(name = "REG_DATE")
    private String regDate;
    private String regUser;
    @Column(name = "UPDATE_DATE")
    private String updateDate;
    private String updaTeUser;

    @Id
    @Column(name = "GOODS_ID")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "GOODS_CODE")
    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
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
    @Column(name = "UPDATe_USER")
    public String getUpdaTeUser() {
        return updaTeUser;
    }

    public void setUpdaTeUser(String updaTeUser) {
        this.updaTeUser = updaTeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (goodsId != that.goodsId) return false;
        if (goodsCode != null ? !goodsCode.equals(that.goodsCode) : that.goodsCode != null) return false;
        if (regDate != null ? !regDate.equals(that.regDate) : that.regDate != null) return false;
        if (regUser != null ? !regUser.equals(that.regUser) : that.regUser != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (updaTeUser != null ? !updaTeUser.equals(that.updaTeUser) : that.updaTeUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodsId;
        result = 31 * result + (goodsCode != null ? goodsCode.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (regUser != null ? regUser.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (updaTeUser != null ? updaTeUser.hashCode() : 0);
        return result;
    }
}
