package com.test.koibrowser.utils.runnableUtils;

import androidx.annotation.NonNull;
import com.test.koibrowser.utils.OnSubscribe;


public class OnStartRunnable<T> implements Runnable {
    private final OnSubscribe<T> onSubscribe;

    public OnStartRunnable(@NonNull OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    @Override 
    public void run() {
        this.onSubscribe.onStart();
    }
}
