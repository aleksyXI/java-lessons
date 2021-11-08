package ru.tn.courses.afedorenko.v5.task2.serialization;

import ru.tn.courses.afedorenko.v5.task2.model.Phone;

public class TextSerialization implements ISerialization {
    @Override
    public String serialize(Phone phone) {
        
        return "Phone{" +
                ", manufacturer='" + phone.getManufacturer() + '\'' +
                ", modelName='" + phone.getModelName() + '\'' +
                ", processor='" + phone.getProcessor() + '\'' +
                ", displaySize='" + phone.getDisplaySize() + '\'' +
                ", battery='" + phone.getBattery() + '\'' +
                '}';
        
    }
}
