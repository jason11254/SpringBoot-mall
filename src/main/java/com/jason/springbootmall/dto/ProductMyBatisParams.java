package com.jason.springbootmall.dto;


public class ProductMyBatisParams {
    private String category;
    private String search;
    private String orderByAndSort;
    private Integer limit;
    private Integer offset;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getOrderByAndSort() {
        return orderByAndSort;
    }

    public void setOrderByAndSort(String orderByAndSort) {
        this.orderByAndSort = orderByAndSort;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
