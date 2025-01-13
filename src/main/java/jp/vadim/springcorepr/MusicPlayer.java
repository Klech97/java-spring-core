package jp.vadim.springcorepr;

import java.util.List;

public class MusicPlayer {
    private List<String> musicList;
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<String> musicList) {
        this.musicList = musicList;
    }

    //Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}

    public void setMusic(Music music)
        {this.music = music;}

    public void playMusic() {
        System.out.println("Plaing: " + music.getSong());
    }

    public void playListMusic() {
        for (String music : musicList)
            System.out.println("Playing:" + music);
    }
}
