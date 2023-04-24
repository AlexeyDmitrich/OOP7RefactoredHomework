package ru.gb.kamenev.controler;

import ru.gb.kamenev.model.ComplexNumber;

public class NumCreator {
    public ComplexNumber createComplexNumber (int index, int material, int imaginary){
        return new ComplexNumber(index, material, imaginary);
    }
}
