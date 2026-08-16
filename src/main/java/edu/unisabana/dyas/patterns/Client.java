package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayerFactory;

public class Client {

    public static void main(String[] args) {

        AudioPlayer audioPlayer =
                AudioPlayerFactory.createAudioPlayer();

        // Reproducir MP4
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.stop();

        // Reproducir VLC
        audioPlayer.play("vlc", "video.vlc");
        audioPlayer.stop();

        // Reproducir FLAC con volumen por defecto de 80%
        audioPlayer.play("flac", "album.flac");
        audioPlayer.stop();

        // Reproducir AAC con volumen por defecto de 80%
        audioPlayer.play("aac", "song.aac");
        audioPlayer.stop();
    }
}