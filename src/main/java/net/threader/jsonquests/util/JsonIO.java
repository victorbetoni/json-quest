package net.threader.jsonquests.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.ParseException;

public class JSONUtils {

    public static JsonObject extractJSON(File file) {
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            return (JsonObject) new JsonParser().parse(reader);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
