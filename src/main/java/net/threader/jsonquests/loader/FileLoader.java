package net.threader.jsonquests.loader;

import org.json.simple.JSONObject;

import java.io.File;

public interface FileLoader<T> {
    T load(File file);
}
