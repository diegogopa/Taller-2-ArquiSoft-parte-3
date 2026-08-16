package edu.unisabana.dyas.patterns.utils;

public class PremiumAudioPlayerAdapter implements AudioPlayer {

    // Volumen por defecto: 80%
    private static final int DEFAULT_VOLUME = 80;

    private final PremiumAudioPlayer premiumAudioPlayer;

    public PremiumAudioPlayerAdapter(PremiumAudioPlayer premiumAudioPlayer) {
        this.premiumAudioPlayer = premiumAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("flac")
                || audioType.equalsIgnoreCase("aac")) {

            premiumAudioPlayer.playAudio(
                    audioType,
                    fileName,
                    DEFAULT_VOLUME
            );
        }
    }

    @Override
    public void stop() {
        premiumAudioPlayer.halt();
    }
}