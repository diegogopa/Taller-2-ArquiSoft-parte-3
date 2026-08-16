package edu.unisabana.dyas.patterns.utils;

public class AudioPlayerFactory {

    public static AudioPlayer createAudioPlayer() {

        AudioPlayer advancedAdapter =
                new AdvancedAudioPlayerAdapter(
                        new AdvancedAudioPlayer()
                );

        AudioPlayer premiumAdapter =
                new PremiumAudioPlayerAdapter(
                        new PremiumAudioPlayer()
                );

        return new AudioPlayerAdapter(
                advancedAdapter,
                premiumAdapter
        );
    }
}