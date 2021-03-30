package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Timer {
    private Long nanoTime = System.nanoTime();
    @Autowired
    public Long getTime() {
        return nanoTime;
    }

    @Override
    public String toString() {
        return "Timer " + nanoTime;
    }
}
