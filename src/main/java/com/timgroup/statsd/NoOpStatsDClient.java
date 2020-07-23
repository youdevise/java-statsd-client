package com.timgroup.statsd;

/**
 * A No-Op StatsDClient, which can be substituted in when metrics are not
 * required.
 * 
 * @author Tom Denley
 *
 */
public final class NoOpStatsDClient extends ConvenienceMethodProvidingStatsDClient {
    @Override public void stop() { }
    @Override public void count(String aspect, long delta, double sampleRate) { }
    @Override public void recordGaugeValue(String aspect, long value) { }
    @Override public void recordGaugeValue(String aspect, double value) { }
    @Override public void recordGaugeDelta(String aspect, long delta) { }
    @Override public void recordGaugeDelta(String aspect, double delta) { }
    @Override public void recordSetEvent(String aspect, String value) { }
    @Override public void recordExecutionTime(String aspect, long timeInMs, double sampleRate) { }
    @Override public void count(String aspect, long delta, double sampleRate, String[] tags) { }
    @Override public void recordGaugeValue(String aspect, long value, String[] tags) { }
    @Override public void recordGaugeValue(String aspect, double value, String[] tags) { }
    @Override public void recordGaugeDelta(String aspect, long delta, String[] tags) { }
    @Override public void recordGaugeDelta(String aspect, double delta, String[] tags) { }
    @Override public void recordSetEvent(String aspect, String value, String[] tags) { }
    @Override public void recordExecutionTime(String aspect, long timeInMs, double sampleRate, String[] tags) { }
    @Override public void setClientTags(String[] tags) { }
}
