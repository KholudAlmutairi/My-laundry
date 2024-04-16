package com.example.mylaundry.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer laundryId;

    private Integer customerId;

    // ايجكت الخدمة
    //private ServiceLaundry serviceLaundry;

   // @Column(columnDefinition = "double")
   // @NotNull
    private double deliveryPrice;

    //@Column(columnDefinition = "double")
   // @NotNull
    private double totalPrice;

   //@NotEmpty(message = "location should not be empty")
   //@Column(columnDefinition = "varchar(10) not null ")
   // @Column(columnDefinition = "varchar(8) not null")
    private String nationalAddress;
    private String district;
    private String street;

   // @NotNull(message = "rating should not be empty")
   //@Column(columnDefinition = "int not null ")
    private Integer rating;

   //@NotEmpty(message = "comment should not be empty")
   // @Column(columnDefinition = "varchar(30) not null ")
    private String comment;









}
