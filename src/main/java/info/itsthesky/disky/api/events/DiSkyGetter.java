package info.itsthesky.disky.api.events;

public interface DiSkyGetter<F, T> {
    F get(T arg);
}