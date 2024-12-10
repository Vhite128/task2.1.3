package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private long nanoTime = System.nanoTime();

    public long getTime() {
        return nanoTime;
    }
}