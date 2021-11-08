package ru.tn.courses.afedorenko.v5.task2.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.tn.courses.afedorenko.v5.task2.model.Phone;

public class XMLSerialization implements ISerialization {
    
    @Override
    public String serialize(Phone phone) {
        XmlMapper mapper = new XmlMapper();
        try {
            return mapper.writeValueAsString(phone);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
