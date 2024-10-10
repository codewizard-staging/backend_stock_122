package com.app.stock.converter;

import com.app.stock.enums.PetServiceType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class PetServiceTypeConverter implements AttributeConverter<PetServiceType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PetServiceType petServiceType) {
        return petServiceType != null ? petServiceType.ordinal() : null;
    }

    @Override
    public PetServiceType convertToEntityAttribute(Integer dbData) {
		return PetServiceType.getPetServiceType(dbData);
    }
}
