package com.tufarma.pos.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//This is the user model in a MVC project
//Mapping this class as a table user on my db with jpa

@Entity
//@Table(name="USERS")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String userId;
    private String name;
    private String username;
    private String password;
    private String mail;
    private String img;
    private String[] roles;//ROLE_USER, ROLE_ADMIN(delete)
    private String[] authorities;//authorities users have
    private boolean isActive;
    private boolean isNotLocked;
    private Date lastLoginDate;
    private Date lasLoginDateDisplay;
    private Date joinDate;

    public User() {}

    public User(Long id, String userId, String name, String username, String password, String mail, String img, String[] roles, String[] authorities, boolean isActive, boolean isNotLocked, Date lastLoginDate, Date lasLoginDateDisplay, Date joinDate) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.img = img;
        this.roles = roles;
        this.authorities = authorities;
        this.isActive = isActive;
        this.isNotLocked = isNotLocked;
        this.lastLoginDate = lastLoginDate;
        this.lasLoginDateDisplay = lasLoginDateDisplay;
        this.joinDate = joinDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public boolean isNotLocked() { return isNotLocked; }

    public void setNotLocked(boolean notLocked) { isNotLocked = notLocked; }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLasLoginDateDisplay() {
        return lasLoginDateDisplay;
    }

    public void setLasLoginDateDisplay(Date lasLoginDateDisplay) {
        this.lasLoginDateDisplay = lasLoginDateDisplay;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
