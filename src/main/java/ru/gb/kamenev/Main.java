package ru.gb.kamenev;

import ru.gb.kamenev.controler.Calculator;
import ru.gb.kamenev.controler.NumCreator;
import ru.gb.kamenev.model.ComplexNumber;
import ru.gb.kamenev.view.Gui;

public class Main {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        NumCreator prod = new NumCreator();
//        ComplexNumber m1 = prod.createComplexNumber(1,1,-1);
//        ComplexNumber m2 = prod.createComplexNumber(2, 2, 3);
//        System.out.println(m1);
//        System.out.println(m2);
//        ComplexNumber sum = (ComplexNumber) calc.summ(m1,m2);
//        System.out.println(sum);
//        ComplexNumber sub = (ComplexNumber) calc.subtraction(m1,m2);
//        System.out.println(sub);
//        ComplexNumber mult = (ComplexNumber) calc.multiplication(m1,m2);
//        System.out.println(mult);
    Gui console = new Gui();
    console.run();
    }
}