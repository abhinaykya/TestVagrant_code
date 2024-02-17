package testVagrant;

public class MainTest {
    public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.playSong("user1", "S1");
        store.playSong("user1", "S2");
        store.playSong("user1", "S3");
        System.out.println("User1's recently played: " + store.getRecentlyPlayed("user1"));

        store.playSong("user1", "S4");
        System.out.println("User1's recently played after playing S4: " + store.getRecentlyPlayed("user1"));

        store.playSong("user1", "S2");
        System.out.println("User1's recently played after playing S2 again: " + store.getRecentlyPlayed("user1"));

        store.playSong("user1", "S1");
        System.out.println("User1's recently played after playing S1 again: " + store.getRecentlyPlayed("user1"));
    }
}
