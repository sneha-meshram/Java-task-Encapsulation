package com.stackroute.task;

public class Printing {

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPagesPrint() {
        return numberOfPagesPrint;
    }

    public void setNumberOfPagesPrint(int numberOfPagesPrint) {
        this.numberOfPagesPrint = numberOfPagesPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getBothside() {
        return bothside;
    }

    public void setBothside(int bothside) {
        this.bothside = bothside;
    }

    private int numberOfPages;
    private int numberOfPagesPrint;
    private int tonerLevel = 100;
    private int bothside;

    public void Printer(int tonerLevel, int numberOfPagesPrint, int bothside, int numberOfPages) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrint = numberOfPagesPrint;
        this.bothside = bothside;
        this.numberOfPages = numberOfPages;
    }

    private int tonerLevel(int numberOfPagesPrint) {

        if ((tonerLevel - ((int) numberOfPagesPrint - 1)) < 0) {
            System.out.println(tonerLevel);
            return 1;
        } else {
            return 0;
        }
    }

    private int bothside(int number) {
        int remainingPages = numberOfPages - numberOfPagesPrint / 2;
        if (remainingPages < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void printPage(int printPage) {
        if (bothside == 1) {
            if (tonerLevel == 0) {
                System.out.println("toner level is empty");
            }
            if (numberOfPages == 0) {
                System.out.println("There is no Pages");
            }
        } else if (bothside == 1) {
            if (printPage % 2 == 0) {
                if (tonerLevel == 0) {
                    System.out.println("toner level is empty");
                }
                if (numberOfPages == 0) {
                    System.out.println("There is no Pages");
                }
                if (printPage > 0) {
                    if (numberOfPages != 0) {
                        numberOfPages = printPage / 2;
                        System.out.println("no pages are available here");
                    }
                }
            }
        }
    }
}

