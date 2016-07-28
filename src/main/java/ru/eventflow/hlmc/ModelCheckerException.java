package ru.eventflow.hlmc;

public class ModelCheckerException extends Exception {
    public ModelCheckerException() {
    }

    public ModelCheckerException(String s) {
        super(s);
    }

    public ModelCheckerException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ModelCheckerException(Throwable throwable) {
        super(throwable);
    }
}
