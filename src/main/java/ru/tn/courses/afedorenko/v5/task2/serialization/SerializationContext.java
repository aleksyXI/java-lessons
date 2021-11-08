package ru.tn.courses.afedorenko.v5.task2.serialization;

import ru.tn.courses.afedorenko.v5.task2.model.Phone;

public abstract class SerializationContext {
    private ISerialization serialization;
    
    public void setSerialization(ISerialization serialization) {
        this.serialization = serialization;
    }
    
    public String serialize(Phone phone){
        return serialization.serialize(phone);
    }
}
