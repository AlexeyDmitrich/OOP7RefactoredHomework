package ru.gb.kamenev.controler;

import ru.gb.kamenev.model.Calculatable;
import ru.gb.kamenev.model.Number;

public class Calculator<N extends Number> {

    public N summ (N arg1, N arg2){
        N sum = (N) arg1.sum(arg2);
        return sum;
    }

    N subtraction (N arg1, N arg2){
        N sub = (N) arg1.subtraction(arg2);
        return sub;
    }

    N multiplication (N arg1, N arg2){
        N mult = (N) arg1.multiplication(arg2);
        return mult;
    }

    N division (N arg1, N arg2){
        N div = (N) arg1.division(arg2);
        return div;
    }

    N sqrt (N arg){
        N sq = (N) arg.sqrt();
        return sq;
    }

    N exp (N arg){
        N xp = (N) arg.exp();
        return xp;
    }
}