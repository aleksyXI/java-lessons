package ru.tn.courses.afedorenko.v5.task2.serialization;

import ru.tn.courses.afedorenko.v5.task2.model.Phone;

public class JsonSerialization implements ISerialization {
    @Override
    public String serialize(Phone phone) {
        return String.format("{ \"manufacturer\":\"%s\"" +
                ",\"model_name\":\"%s\"" +
                ",\"processor\":\"%s\"" +
                ",\"display_size\":\"%s\"" +
                ",\"battery\":\"%s\"" +
                "}", phone.getManufacturer(), phone.getModelName(), phone.getProcessor(), phone.getDisplaySize(), phone.getBattery());
    }
}
