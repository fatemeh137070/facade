package org.example;

class VideoConverter {
    public String convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        String sourceCodec = new CodecFactory().extract(file);
        String destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = "MPEG4";
        } else {
            destinationCodec = "Ogg";
        }

        String buffer = BitrateReader.read(filename, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);
        result = new AudioMixer().fix(result);
        return result;
    }
}