package edu.unisabana.dyas.patterns.utils;

public class AudioPlayerAdapter implements AudioPlayer {

    private final AudioPlayer advancedAdapter;
    private final AudioPlayer premiumAdapter;

    private AudioPlayer activePlayer;

    public AudioPlayerAdapter(
            AudioPlayer advancedAdapter,
            AudioPlayer premiumAdapter) {

        this.advancedAdapter = advancedAdapter;
        this.premiumAdapter = premiumAdapter;
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("vlc")) {

            activePlayer = advancedAdapter;

        } else if (audioType.equalsIgnoreCase("flac")
                || audioType.equalsIgnoreCase("aac")) {

            activePlayer = premiumAdapter;

        } else {
            return;
        }

        activePlayer.play(audioType, fileName);
    }

    @Override
    public void stop() {

        if (activePlayer != null) {
            activePlayer.stop();
            activePlayer = null;
        }
    }
}