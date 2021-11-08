package ru.tn.courses.afedorenko.v5.task2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.tn.courses.afedorenko.v5.task2.serialization.Serialization;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private Serialization.Type type;
    private String manufacturer;
    private String modelName;
    private String processor;
    private String displaySize;
    private String battery;
}
