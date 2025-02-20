# Video Conversion System

This project demonstrates the use of the **Facade design pattern** to simplify the interaction with a complex video conversion framework. The goal of this application is to convert video files into different formats using a simple interface, without dealing with the complexities of video codec, bitrate reading, and audio mixing.

## Project Structure

### 1. **Facade Design Pattern**

The Facade class (`VideoConverter`) acts as an interface that simplifies the interaction with multiple subsystem classes such as `CodecFactory`, `BitrateReader`, and `AudioMixer`. Instead of dealing with each of these classes directly, the client code only interacts with the Facade, which manages the complexity behind the scenes.

### 2. **Subsystem Classes**

- **VideoFile**: Represents a video file to be converted.
- **CodecFactory**: Extracts the necessary codec for the given video file.
- **MPEG4CompressionCodec & OggCompressionCodec**: Handle video compression in different formats.
- **BitrateReader**: Reads and converts video data from one codec to another.
- **AudioMixer**: Fixes the audio issues of the converted video.

### 3. **Client Code**

The client (in this case, `Application`) uses the `VideoConverter` Facade to convert video files without interacting with the complex classes directly.

## How It Works

1. The client provides a video filename and the desired format (e.g., `mp4` or `ogg`).
2. The `VideoConverter` Facade handles the entire process of selecting the correct codec, reading the video file, converting the data, and fixing the audio.
3. The final video file is returned after processing, and can be saved or further manipulated.

## Example Usage

### 1. Convert a video to `mp4` format:

```java
public class Application {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        String result = converter.convert("funny-cats-video.ogg", "mp4");
        System.out.println(result);
    }
}
