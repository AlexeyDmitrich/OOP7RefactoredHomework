package ru.gb.kamenev.controler;

import ru.gb.kamenev.model.Log;
import ru.gb.kamenev.model.Loggable;

public class Logger implements Loggable {
    Log log;

    public Logger() {
        this.log = new Log();
    }

    @Override
    public void log(String comment) {
        log.add(comment);
    }

    public String printLogs (){
        return log.out();
    }
}
