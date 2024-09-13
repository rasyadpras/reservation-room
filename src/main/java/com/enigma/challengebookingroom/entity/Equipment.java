package com.enigma.challengebookingroom.entity;

import com.enigma.challengebookingroom.constant.ConstantTable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = ConstantTable.EQUIPMENT)
@Builder
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private String equipmentId;

    @Column(name = "equipment_name", nullable = false, unique = true)
    private String equipmentName;

}