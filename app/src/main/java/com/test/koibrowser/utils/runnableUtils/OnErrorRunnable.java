package com.test.koibrowser.utils.runnableUtils;

import androidx.annotation.NonNull;
import com.test.koibrowser.utils.OnSubscribe;


public class OnErrorRunnable<T> implements Runnable {
    private final OnSubscribe<T> onSubscribe;
    private final Throwable throwable;

    public OnErrorRunnable(@NonNull OnSubscribe<T> onSubscribe, @NonNull Throwable th) {
        this.onSubscribe = onSubscribe;
        this.throwable = th;
    }

    @Override 
    public void run() {
        this.onSubscribe.onError(this.throwable);
    }
}
