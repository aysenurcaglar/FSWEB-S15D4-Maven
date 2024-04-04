package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {
    public WorkintechList() {
        super();
    }
    @Override
    public boolean add(T t) {
        if (!contains(t)) {
            super.add(t);
            return true;
        }
        return false;

    }

    @Override
    public void add(int index, T element) {
        if (!contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public T remove(int index) {
        T removed = super.remove(index);
        return removed;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        return removed;
    }

    public void sort() {
        Collections.sort(this);
    }
}
