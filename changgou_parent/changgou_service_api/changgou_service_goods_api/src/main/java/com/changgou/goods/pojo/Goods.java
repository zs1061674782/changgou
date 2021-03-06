package com.changgou.goods.pojo;

import java.util.List;

/**
 * 为了实现商品的保存（sku+spu就是完整的商品属性）
 */
public class Goods {

    //spu
    private Spu spu;

    //sku集合
    private List<Sku> skuList;

    public Spu getSpu() {
        return spu;
    }

    public void setSpu(Spu spu) {
        this.spu = spu;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }
}
