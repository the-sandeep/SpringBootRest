package com.saan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "employee")
@Entity
@ApiModel(description = "All details about the Employee. ")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The database generated employee ID")
    private Long id;

    @ApiModelProperty(notes = "The employee name")
    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Address> address;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Technology> technology;
}
