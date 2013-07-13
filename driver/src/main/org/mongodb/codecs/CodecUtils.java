package org.mongodb.codecs;

import org.bson.BSONWriter;
import org.mongodb.Encoder;

public class CodecUtils {
    //TODO Trish nothing says code smell quite as much as a Util class...


    public static <T> void encode(final EncoderRegistry encoderRegistry, final BSONWriter bsonWriter, final T value) {
        final Encoder encoder = encoderRegistry.get(value);
        encoder.encode(bsonWriter, value);
    }

}