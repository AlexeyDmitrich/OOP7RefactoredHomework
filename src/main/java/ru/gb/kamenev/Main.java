package ru.gb.kamenev;

import ru.gb.kamenev.controler.Calculator;
import ru.gb.kamenev.controler.NumCreator;
import ru.gb.kamenev.model.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        NumCreator prod = new NumCreator();
        ComplexNumber m1 = prod.createComplexNumber(1,1,-1);
        ComplexNumber m2 = prod.createComplexNumber(2, 2, 3);
        System.out.println(m1);
        System.out.println(m2);
        ComplexNumber m3 = (ComplexNumber) calc.summ(m1,m2);
        System.out.println(m3);
    }
}