package com.test.koibrowser.utils.runnableUtils;

import androidx.annotation.NonNull;
import com.test.koibrowser.utils.OnSubscribe;


public class OnCompleteRunnable<T> implements Runnable {
    private final OnSubscribe<T> onSubscribe;

    public OnCompleteRunnable(@NonNull OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    @Override 
    public void run() {
        this.onSubscribe.onComplete();
    }
}
