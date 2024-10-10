package com.app.stock.function;

import com.app.stock.model.Manager;
import com.app.stock.model.Pet;
import com.app.stock.model.PetCareCenter;
import com.app.stock.model.PetOwner;
import com.app.stock.model.Document;
import com.app.stock.model.PetService;




import com.app.stock.enums.PetServiceType;
import com.app.stock.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  