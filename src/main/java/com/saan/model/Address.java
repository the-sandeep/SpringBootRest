package com.saan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Sandeep Maurya
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
@Entity
@ApiModel(value = "All details about the Address.")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated address ID")
    private Long id;

    @ApiModelProperty(notes = "The address type")
    private String addressType;

    @ApiModelProperty(notes = "The address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

}
