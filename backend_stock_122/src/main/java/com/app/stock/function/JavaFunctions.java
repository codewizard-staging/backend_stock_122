package com.app.stock.function;

import com.app.stock.model.Manager;
import com.app.stock.model.Pet;
import com.app.stock.model.PetCareCenter;
import com.app.stock.model.PetOwner;
import com.app.stock.model.Document;
import com.app.stock.model.PetService;
import com.app.stock.enums.PetServiceType;
import com.app.stock.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.stock.repository.PetServiceRepository;
import com.app.stock.repository.PetOwnerRepository;
import com.app.stock.repository.PetCareCenterRepository;
import com.app.stock.repository.ManagerRepository;
import com.app.stock.repository.DocumentRepository;
import com.app.stock.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
