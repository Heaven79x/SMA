public class Song {
    private String id;
    private String title;
    private String artist;
    private String album;
    private int duration;
    private String path;
    private String dateAdded;
    private String albumArt;

    // Constructor
    public Song(String id, String title, String artist, String album, int duration, String path, String dateAdded, String albumArt) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.path = path;
        this.dateAdded = dateAdded;
        this.albumArt = albumArt;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    public String getDateAdded() { return dateAdded; }
    public void setDateAdded(String dateAdded) { this.dateAdded = dateAdded; }

    public String getAlbumArt() { return albumArt; }
    public void setAlbumArt(String albumArt) { this.albumArt = albumArt; }
}