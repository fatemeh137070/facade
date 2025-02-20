package org.example;

public class Application {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        String result = converter.convert("funny-cats-video.ogg", "mp4");
        System.out.println(result);
    }
}