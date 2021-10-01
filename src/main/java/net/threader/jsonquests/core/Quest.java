package net.threader.jsonquests.core;

import org.json.simple.JSONObject;

import java.io.File;

public class Quest {

    private File questFile;
    private JSONObject questJson;
    private String identifier;

    public Quest(File questFile, JSONObject questJson, String identifier) {
        this.questFile = questFile;
        this.questJson = questJson;
        this.identifier = identifier;
    }

    public File getQuestFile() {
        return questFile;
    }

    public JSONObject getQuestJson() {
        return questJson;
    }

    public String getIdentifier() {
        return identifier;
    }
}
