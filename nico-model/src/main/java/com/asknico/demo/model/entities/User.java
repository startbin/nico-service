package com.asknico.demo.model.entities;

import java.io.Serializable;
import java.util.Date;


/**
 * 后台管理账户表
 * bjd_user
 */
public class User implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;      // 自增长列
	private String username; // 用户名
	private String password; // 密码
	private String fullName; // 全名
	private String address;  // 住址
	private String mobile; // 手机号
	private Integer age;    // 年龄
	private String gender;   // 性别
	private String email; // 邮箱
    private String education; // 学历
    private Date birthday; // 生日
    private String postalCode; // 邮编
    private String regIp; // 注册时IP
    private Integer accountEnabled; // 帐号是否可用
    private Integer accountExpired; // 帐号是否过期
    private Integer accountLocked; // 帐号是否锁定
	private Date lastLoginTime; // 最后登陆时间
    private PageEx pageEx;   //分页工具

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Integer getAccountEnabled() {
        return accountEnabled;
    }

    public void setAccountEnabled(Integer accountEnabled) {
        this.accountEnabled = accountEnabled;
    }

    public Integer getAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(Integer accountExpired) {
        this.accountExpired = accountExpired;
    }

    public Integer getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(Integer accountLocked) {
        this.accountLocked = accountLocked;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public PageEx getPageEx() {
        return pageEx;
    }

    public void setPageEx(PageEx pageEx) {
        this.pageEx = pageEx;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", birthday=" + birthday +
                ", postalCode='" + postalCode + '\'' +
                ", regIp='" + regIp + '\'' +
                ", accountEnabled=" + accountEnabled +
                ", accountExpired=" + accountExpired +
                ", accountLocked=" + accountLocked +
                ", lastLoginTime=" + lastLoginTime +
                ", pageEx=" + pageEx +
                '}';
    }
}
