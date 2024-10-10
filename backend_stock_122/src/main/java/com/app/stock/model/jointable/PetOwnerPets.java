package com.app.stock.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.stock.model.Manager;
import com.app.stock.model.Pet;
import com.app.stock.model.PetCareCenter;
import com.app.stock.model.PetOwner;
import com.app.stock.model.Document;
import com.app.stock.model.PetService;
import com.app.stock.enums.PetServiceType;
import com.app.stock.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"stock_098\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}