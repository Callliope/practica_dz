package org.example.searadar.mr231.station;

import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.example.searadar.mr231_3.convert.Mr231Converter;

import ru.oogis.searadar.api.convert.SearadarExchangeConverter;
import ru.oogis.searadar.api.station.AbstractStationType;

import java.nio.charset.Charset;

public class Mr231StationType extends AbstractStationType {

    private static final String STATION_TYPE = "МР-231";
    private static final String CODEC_NAME = "mr231";

    @Override
    protected void doInitialize() {
        TextLineCodecFactory textLineCodecFactory = new TextLineCodecFactory(
                Charset.defaultCharset(),
                LineDelimiter.UNIX,
                LineDelimiter.CRLF
        );

        // Дополнительные инициализации, если необходимо
    }

    @Override
    public SearadarExchangeConverter createConverter() {
        return new Mr231Converter();
    }
}

