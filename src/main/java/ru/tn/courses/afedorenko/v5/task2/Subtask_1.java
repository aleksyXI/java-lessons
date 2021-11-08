package ru.tn.courses.afedorenko.v5.task2;

import ru.tn.courses.afedorenko.v5.task2.model.Phone;
import ru.tn.courses.afedorenko.v5.task2.serialization.Serialization;

public class Subtask_1 {
    public static void main(String[] args) {
        Phone phone = new Phone(Serialization.Type.JSON, "Samsung", "S10", "Exynos", "6.1", "3000Mah");
        Serialization serialization = new Serialization();
        
        serialization.setType(phone.getType());
        System.out.println(serialization.serialize(phone));
    }
}
