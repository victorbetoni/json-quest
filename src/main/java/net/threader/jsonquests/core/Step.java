package net.threader.jsonquests.core;

import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Step implements Listener {

    private Quest parent;
    private Class<? extends Event> listened;
    private List<Predicate<Event>> test;

    @EventHandler
    public void handle(Event event) {
        if(event.getClass().equals(listened)) {
            if(test.stream().allMatch(predicate -> predicate.test(event))) {
                this.complete();
            }
        }
    }

    public void complete() {

    }

}
