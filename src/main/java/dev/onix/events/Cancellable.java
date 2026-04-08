package dev.onix.events;

public interface Cancellable {

    boolean isCancelled();

    void cancel();

}