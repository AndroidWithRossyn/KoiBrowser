package com.test.koibrowser.utils.schedulerUtils;

import androidx.annotation.NonNull;
import com.test.koibrowser.Interface.Scheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class SingleThreadedScheduler implements Scheduler {
    private final Executor mSingleThreadExecutor = Executors.newSingleThreadExecutor();

    @Override 
    public void execute(@NonNull Runnable runnable) {
        this.mSingleThreadExecutor.execute(runnable);
    }
}
