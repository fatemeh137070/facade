package org.example;

class BitrateReader {
    public static String read(String filename, String codec) {
        return "Reading " + filename + " with codec: " + codec;
    }
    
    public static String convert(String buffer, String codec) {
        return "Converting " + buffer + " to " + codec;
    }
}
