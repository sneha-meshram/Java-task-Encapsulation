package com.stackroute.task;

public class PrinterMain {
    public static void main(){
        Printing printer=new Printing();
        printer.Printer(80,6,4,100);

        printer.getTonerLevel();

        printer.getNumberOfPagesPrint();

        printer.getBothside();

        printer.getNumberOfPages();

        printer.printPage(10);



    }

}
