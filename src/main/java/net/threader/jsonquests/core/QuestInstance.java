package net.threader.jsonquests.core;

import org.json.simple.JSONObject;

import java.io.File;
import java.util.UUID;

public class QuestInstance {
    private UUID actor;
    private Quest original;
    private File file;
    private JSONObject json;
    private int progress;

    public QuestInstance(UUID actor, Quest original, File file, JSONObject json, int progress) {
        this.actor = actor;
        this.original = original;
        this.file = file;
        this.json = json;
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }

    public UUID getActor() {
        return actor;
    }

    public Quest getOriginal() {
        return original;
    }

    public File getFile() {
        return file;
    }

    public JSONObject getJson() {
        return json;
    }
}
