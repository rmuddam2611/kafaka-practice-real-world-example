package com.kafka;

import com.kafka.entity.MediaData;
import com.kafka.repository.MediaDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MediaConsumer {


    @Autowired
    MediaDataRepository mediaDataRepository;

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format(" Event Message received"), message);

        MediaData mediaData = new MediaData();
        mediaData.setMediadata(message);
        mediaDataRepository.save(mediaData);
    }

}
