package co.edu.poli.ces3.socrates.dao;

import co.edu.poli.ces3.socrates.utils.annotations.Column;
import co.edu.poli.ces3.socrates.utils.annotations.Table;

import java.util.Date;

@Table(name = "users")
public class User {
    @Column(name = "id", primaryKey = true)
    private Integer id;
    @Column(name = "names")
    private String names;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "email")
    private String email;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "phone")
    private String phone;
    @Column(name = "gender")
    private String gender;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "deleted_at")
    private Date deletedAt;

    public User(String names, String lastName) {
        this.names = names;
        this.lastName = lastName;
    }

    public User(){

    }

    public User(Integer id, String names, String lastName, String password, Date birthdate, String email, Boolean isActive, String phone, String gender, Date createdAt, Date updatedAt, Date deletedAt) {
        this.id = id;
        this.names = names;
        this.lastName = lastName;
        this.password = password;
        this.birthdate = birthdate;
        this.email = email;
        this.isActive = isActive;
        this.phone = phone;
        this.gender = gender;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAat(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.names + ", Apellido: " + this.lastName + ", Email: " + this.email;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((User) obj).id);
    }

}
