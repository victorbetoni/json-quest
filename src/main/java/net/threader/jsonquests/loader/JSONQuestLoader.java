package net.threader.jsonquests.loader;

import net.threader.jsonquests.core.Quest;
import net.threader.jsonquests.util.JsonIO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.util.Objects;

public class JSONQuestLoader implements FileLoader<Quest> {

    @Override
    public Quest load(File file) {
        JSONObject object = JsonIO.extractJSON(file);

        String identifier = (String) object.get("identifier");
        JSONArray steps = (JSONArray) object.get("steps");
        //load each step

        return new Quest(file, object, identifier, null);
    }
}
