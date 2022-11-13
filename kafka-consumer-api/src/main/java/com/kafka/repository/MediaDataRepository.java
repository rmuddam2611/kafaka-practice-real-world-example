package com.kafka.repository;

import com.kafka.entity.MediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaDataRepository extends JpaRepository<MediaData, Long> {
}
