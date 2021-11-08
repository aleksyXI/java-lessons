package ru.tn.courses.afedorenko.v5.task2.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import ru.tn.courses.afedorenko.v5.task2.model.Phone;

public interface ISerialization {
    String serialize(Phone phone);
}
