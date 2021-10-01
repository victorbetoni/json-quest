package net.threader.jsonquests.core;

import org.json.simple.JSONObject;

import java.io.File;
import java.util.List;

public class Quest {

    private File questFile;
    private JSONObject questJson;
    private String identifier;
    private List<Step> steps;

    public Quest(File questFile, JSONObject questJson, String identifier, List<Step> steps) {
        this.questFile = questFile;
        this.questJson = questJson;
        this.identifier = identifier;
        this.steps = steps;
    }

    public List<Step> getSteps() {
        return steps;
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
