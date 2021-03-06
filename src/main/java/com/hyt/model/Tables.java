package com.hyt.model;

import java.io.Serializable;

public class Tables implements Serializable {

    @Override
    public String toString() {
        return "Tables{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", qqnum='" + qqnum + '\'' +
                ", classes='" + classes + '\'' +
                ", dormitory='" + dormitory + '\'' +
                ", organization='" + organization + '\'' +
                ", introduction='" + introduction + '\'' +
                ", likes='" + likes + '\'' +
                ", future='" + future + '\'' +
                ", traget='" + traget + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.id
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.name
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.gender
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.phonenum
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String phonenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.qqnum
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String qqnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.classes
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String classes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.dormitory
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String dormitory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.organization
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String organization;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.introduction
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.likes
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String likes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.future
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String future;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.traget
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String traget;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables.picture
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    private String picture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.id
     *
     * @return the value of tables.id
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.id
     *
     * @param id the value for tables.id
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.name
     *
     * @return the value of tables.name
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.name
     *
     * @param name the value for tables.name
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.gender
     *
     * @return the value of tables.gender
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.gender
     *
     * @param gender the value for tables.gender
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.phonenum
     *
     * @return the value of tables.phonenum
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.phonenum
     *
     * @param phonenum the value for tables.phonenum
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.qqnum
     *
     * @return the value of tables.qqnum
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getQqnum() {
        return qqnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.qqnum
     *
     * @param qqnum the value for tables.qqnum
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setQqnum(String qqnum) {
        this.qqnum = qqnum == null ? null : qqnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.classes
     *
     * @return the value of tables.classes
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getClasses() {
        return classes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.classes
     *
     * @param classes the value for tables.classes
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.dormitory
     *
     * @return the value of tables.dormitory
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getDormitory() {
        return dormitory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.dormitory
     *
     * @param dormitory the value for tables.dormitory
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setDormitory(String dormitory) {
        this.dormitory = dormitory == null ? null : dormitory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.organization
     *
     * @return the value of tables.organization
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.organization
     *
     * @param organization the value for tables.organization
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.introduction
     *
     * @return the value of tables.introduction
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.introduction
     *
     * @param introduction the value for tables.introduction
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.likes
     *
     * @return the value of tables.likes
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.likes
     *
     * @param likes the value for tables.likes
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setLikes(String likes) {
        this.likes = likes == null ? null : likes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.future
     *
     * @return the value of tables.future
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getFuture() {
        return future;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.future
     *
     * @param future the value for tables.future
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setFuture(String future) {
        this.future = future == null ? null : future.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.traget
     *
     * @return the value of tables.traget
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getTraget() {
        return traget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.traget
     *
     * @param traget the value for tables.traget
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setTraget(String traget) {
        this.traget = traget == null ? null : traget.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables.picture
     *
     * @return the value of tables.picture
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables.picture
     *
     * @param picture the value for tables.picture
     *
     * @mbggenerated Thu Aug 01 10:09:54 CST 2019
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }



}