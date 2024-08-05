package com.mytube;

public class VideoProcessor {
    private Video video;

    private void encode(CanEncodeVideo encoder){
        encoder.encode(this.video);
    }

    private void store(CanStoreVideo database){
        database.store(this.video);
    }

    private void notify(CanSendMessage messagingService) {
        messagingService.sendMessageTo(this.video.getUser());
    }

    public void process(CanEncodeVideo encoder, CanStoreVideo database, CanSendMessage messagingService) {
        this.encode(encoder);
        this.store(database);
        this.notify(messagingService);
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}

