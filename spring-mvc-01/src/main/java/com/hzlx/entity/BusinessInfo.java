package com.hzlx.entity;

import java.util.Date;

/**
 * spring-mvc
 * 2023/5/11 14:47
 * 星期四
 */
public class BusinessInfo {
    private Integer id;
    private String name;
    private String userName;
    private String password;
    private String address;
    private String tel;
    private Date createTime;
    private Integer jobType;
    private Integer status;


    public BusinessInfo() {
    }

    public BusinessInfo(Integer id, String name, String userName, String password, String address, String tel, Date createTime, Integer jobType, Integer status) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.tel = tel;
        this.createTime = createTime;
        this.jobType = jobType;
        this.status = status;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    /**
     * 设置
     * @param jobType
     */
    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    /**
     * 获取
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String toString() {
        return "Business{id = " + id + ", name = " + name + ", userName = " + userName + ", password = " + password + ", address = " + address + ", tel = " + tel + ", createTime = " + createTime + ", jobType = " + jobType + ", status = " + status + "}";
    }
}
