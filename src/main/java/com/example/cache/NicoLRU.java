package com.example.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class NicoLRU {
  private int capacity;
  private LinkedHashMap<Integer, String> map;

  public NicoLRU(int capacity) {
    this.capacity = capacity;
    this.map = new LinkedHashMap<Integer, String>(capacity, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size() > NicoLRU.this.capacity;
      }
    };
  }

  public String get(int key) {
    return map.getOrDefault(key, "empty value");
  }

  public void put(int key, String value) {
    map.put(key, value);
  }

  public void append(String value) {
    if (map.size() >= capacity) {
      Integer firstKey = map.keySet().iterator().next();
      map.remove(firstKey);
    }
    int newKey = map.size() + 1;
    map.put(newKey, value);
  }

}
