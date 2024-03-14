package com.example.jardineria.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_code", nullable = false)
    private Integer customerCode;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_last_name")
    private String contactLastName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "fax", nullable = false)
    private String fax;

    @Column(name = "address_line1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "postal_code")
    private String postalCode;

    @ManyToOne
    @JoinColumn(name = "sales_rep_employee_code")
    private Employee salesRepresentativeEmployee;

    @Column(name = "credit_limit", precision = 15, scale = 2)
    private Double creditLimit;
}
