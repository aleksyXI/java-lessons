package ru.tn.courses.afedorenko.v5.task2.serialization;

public class Serialization extends SerializationContext {
    Type type;
    
    public void setType(Type type) {
        this.type = type;
        
        if (this.type.equals(Type.XML)) setSerialization(new XMLSerialization());
        if (this.type.equals(Type.JSON)) setSerialization(new JsonSerialization());
        if (this.type.equals(Type.TEXT)) setSerialization(new TextSerialization());
        
    }
    
    public enum Type {
        TEXT, XML, JSON
    }
}

