package Exceptions;

public class NoMoneyException extends Exception {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}


