package com.shzlw.poli.model;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shzlw.poli.util.RawStringDeserialzier;

import java.util.ArrayList;
import java.util.List;

public class Widget {

    private long id;
    private String name;
    private int x;
    private int y;
    private int width;
    private int height;
    private long jdbcDataSourceId;
    private long dashboardId;
    private String sqlQuery;
    /**
     * table
     * kpi
     */
    private String type;

    /**
     * Json column
     * name, type, display name
     */
    private String columns;

    /**
     * {
     *     sqlQuery,
     *
     * }
     *
     */
    private String data;

    /**
     * {
     *  ":fields": "a,b,c",
     *  "valu2": "value2"
     * }
     */
    private String filterParams;

    // json column
    private String chartOptions;

    /**
     * NON database field.
     */
    private String queryResult;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getJdbcDataSourceId() {
        return jdbcDataSourceId;
    }

    public void setJdbcDataSourceId(long jdbcDataSourceId) {
        this.jdbcDataSourceId = jdbcDataSourceId;
    }

    public long getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(long dashboardId) {
        this.dashboardId = dashboardId;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public String getSqlQuery() {
        return sqlQuery;
    }

    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonRawValue
    public String getData() {
        return data;
    }

    @JsonDeserialize(using = RawStringDeserialzier.class)
    public void setData(String data) {
        this.data = data;
    }
}
