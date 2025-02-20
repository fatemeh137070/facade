package org.example;

class CodecFactory {
    public String extract(VideoFile file) {
        return "Codec extracted for " + file.getFilename();
    }
}