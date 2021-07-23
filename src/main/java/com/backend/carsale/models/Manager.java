package com.backend.carsale.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String managerRole;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManagerRole() {
        return managerRole;
    }

    public void setManagerRole(String managerRole) {
        this.managerRole = managerRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(id, manager.id) && Objects.equals(managerRole, manager.managerRole) && Objects.equals(email, manager.email) && Objects.equals(password, manager.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerRole, email, password);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", managerRole='" + managerRole + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
