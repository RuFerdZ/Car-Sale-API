package com.backend.carsale.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String inquirerName;

    @Column
    private String inquirerEmail;

    @Column
    private String inquirerTitle;

    @Column(columnDefinition = "TEXT")
    private String inquiryBody;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInquirerName() {
        return inquirerName;
    }

    public void setInquirerName(String inquirerName) {
        this.inquirerName = inquirerName;
    }

    public String getInquirerEmail() {
        return inquirerEmail;
    }

    public void setInquirerEmail(String inquirerEmail) {
        this.inquirerEmail = inquirerEmail;
    }

    public String getInquirerTitle() {
        return inquirerTitle;
    }

    public void setInquirerTitle(String inquirerTitle) {
        this.inquirerTitle = inquirerTitle;
    }

    public String getInquiryBody() {
        return inquiryBody;
    }

    public void setInquiryBody(String inquiryBody) {
        this.inquiryBody = inquiryBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inquiry inquiry = (Inquiry) o;
        return Objects.equals(id, inquiry.id) && Objects.equals(inquirerName, inquiry.inquirerName) && Objects.equals(inquirerEmail, inquiry.inquirerEmail) && Objects.equals(inquirerTitle, inquiry.inquirerTitle) && Objects.equals(inquiryBody, inquiry.inquiryBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inquirerName, inquirerEmail, inquirerTitle, inquiryBody);
    }

    @Override
    public String toString() {
        return "Inquiry{" +
                "id=" + id +
                ", inquirerName='" + inquirerName + '\'' +
                ", inquirerEmail='" + inquirerEmail + '\'' +
                ", inquirerTitle='" + inquirerTitle + '\'' +
                ", inquiryBody='" + inquiryBody + '\'' +
                '}';
    }
}
