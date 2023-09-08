package com.example.kotlinpetsdemo.pets_db.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.Data

@Entity
@Data
class Breed {
    @Id
    var id: Long = 0
    var name: String? = null

}