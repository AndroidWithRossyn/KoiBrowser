package com.test.koibrowser.utils.runnableUtils;

import androidx.annotation.NonNull;
import com.test.koibrowser.utils.OnSubscribe;


public class OnNextRunnable<T> implements Runnable {
    private final T item;
    private final OnSubscribe<T> onSubscribe;

    public OnNextRunnable(@NonNull OnSubscribe<T> onSubscribe, T t) {
        this.onSubscribe = onSubscribe;
        this.item = t;
    }

    @Override 
    public void run() {
        this.onSubscribe.onNext(this.item);
    }
}
