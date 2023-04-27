package ru.gb.kamenev.view;

import ru.gb.kamenev.controler.Calculator;
import ru.gb.kamenev.controler.Logger;
import ru.gb.kamenev.controler.NumCreator;
import ru.gb.kamenev.model.Calculatable;
import ru.gb.kamenev.model.Cash;
import ru.gb.kamenev.model.ComplexNumber;
import ru.gb.kamenev.model.Loggable;
import ru.gb.kamenev.model.Number;

import java.util.Scanner;

public class Gui {
    NumCreator crt = new NumCreator();
    Calculator calc = new Calculator();
    Cash temp = new Cash();
    Logger logger = new Logger();
    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CNUM:
                        createComplNum();
                        break;
                    case PLUSE:
                        sum();
                        break;
                    case MINUSE:
                        subtraction();
                        break;
                    case MULT:
                        multiplication();
                        break;
                    case LOG:
                        showLog();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showLog() {
        System.out.println(logger.printLogs());
    }

    private void log(String comment) {
        logger.log(comment);
    }

    private void multiplication() {
        if (temp.look() instanceof ComplexNumber){
            System.out.println("Давайте создадим второе число.");
            log("*");
            Number res = temp.fromCash().multiplication(this.createComplNum());
            temp.toCash(res);
            log("=");
            log(res.toString());
            System.out.println(res);
        }
    }

    private void subtraction() {
        if (temp.look() instanceof ComplexNumber) {
            System.out.println("Давайте создадим второе число.");
            log("-");
            Number res = temp.fromCash().subtraction(this.createComplNum());
            temp.toCash(res);
            log("=");
            log(res.toString());
            System.out.println(res);
        }
    }

    public ComplexNumber createComplNum() {
        int ind = Integer.parseInt(prompt("Введите индекс для комплекса:"));
        int mat = Integer.parseInt(prompt("Введите материальную часть комплекса:"));
        int img = Integer.parseInt(prompt("Введите мнимую часть комплекса"));
        ComplexNumber complex = crt.createComplexNumber(ind, mat, img);
        log(complex.toString());
        temp.toCash(complex);
        return complex;
    }

    public void sum(){
        if (temp.look() instanceof ComplexNumber){
            System.out.println("Давайте создадим второе число.");
            log("+");
            Number res = temp.fromCash().sum(this.createComplNum());
            log("=");
            log(res.toString());
            temp.toCash(res);
            System.out.println(res);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
