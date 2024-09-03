package com.tacheservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class tache {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idTache;
        private int idProjet;
        private String description;
        private Date dateDebut;
        private Date dateFin;
        private String statut;
}
