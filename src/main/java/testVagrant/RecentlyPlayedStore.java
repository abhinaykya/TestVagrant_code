package testVagrant;

import java.util.*;

public class RecentlyPlayedStore {
    private Map<String, LinkedList<String>> userSongMap;
    private int capacity;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        userSongMap = new HashMap<>();
    }

    public void playSong(String user, String song) {
        if (!userSongMap.containsKey(user)) {
            userSongMap.put(user, new LinkedList<>());
        }
        LinkedList<String> songs = userSongMap.get(user);
        songs.remove(song);
        songs.addFirst(song);
        if (songs.size() > capacity) {
            songs.removeLast();
        }
    }

    public List<String> getRecentlyPlayed(String user) {
        return userSongMap.getOrDefault(user, new LinkedList<>());
    }
}
