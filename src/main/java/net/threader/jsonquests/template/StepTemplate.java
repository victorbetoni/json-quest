package net.threader.jsonquests.template;

import org.bukkit.event.Event;

import java.util.Map;

public class StepTemplate<T extends Event> {

    private Map<String, Class<?>> expectedParams;
    private String identifier;
    private Class<T> listenedEvent;

    public StepTemplate(String identifier, Class<T> event, Map<String, Class<?>> expectedParams) {
        this.expectedParams = expectedParams;
        this.identifier = identifier;
        this.listenedEvent = event;
    }

    public Map<String, Class<?>> getExpectedParams() {
        return expectedParams;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Class<T> getListenedEvent() {
        return listenedEvent;
    }
}
