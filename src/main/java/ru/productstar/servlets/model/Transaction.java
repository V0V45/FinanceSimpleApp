package ru.productstar.servlets.model;

// КЛАСС ЗАМЕСТО EXPENSES С УЧЕТОМ ДОХОДА ИЛИ РАСХОДА
public class Transaction {
    private final String name;
    private final int sum;
    private final boolean isIncome; // если true, то это доход (+), а если false, то это расход (-)

    public Transaction(String name, int sum, boolean isIncome) {
        this.name = name;
        this.sum = sum;
        this.isIncome = isIncome;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public boolean getIsIncome() {
        return isIncome;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
