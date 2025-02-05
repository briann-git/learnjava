package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor();
        processor.setVideo(video);
        processor.process(
                new VideoEncoder(),
                new VideoDatabase(),
                new EmailService()
        );
    }
}
