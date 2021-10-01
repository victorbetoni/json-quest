package net.threader.jsonquests.util;

import net.threader.jsonquests.JSONQuests;
import org.bukkit.Bukkit;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.stream.Stream;

public class JsonIO {

    public static JSONObject extractJSON(File file) {
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            return (JSONObject) new JSONParser().parse(reader);
        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void save(JSONObject object, File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(object.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveAsync(JSONObject obj, File file) {
        Bukkit.getScheduler().runTaskAsynchronously(JSONQuests.instance(), () -> save(obj, file));
    }
}
