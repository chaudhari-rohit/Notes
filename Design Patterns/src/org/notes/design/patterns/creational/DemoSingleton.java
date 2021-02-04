package org.notes.design.patterns.creational;

import java.io.*;

public class DemoSingleton<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T t;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public T getT() {
        return t;
    }

    public void setT(final T t) {
        this.t = t;
    }

    private DemoSingleton() {
        //private constructor
    }

    protected Object readResolve() {
        return getDemoSingletonInstance();
    }

    public static DemoSingleton getDemoSingletonInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }
}
