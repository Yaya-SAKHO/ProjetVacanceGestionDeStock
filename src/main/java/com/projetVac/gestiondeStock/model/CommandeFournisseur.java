package com.projetVac.gestiondeStock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CommandeFournisseur")
public class CommandeFournisseur extends AbstractEntity {
}
