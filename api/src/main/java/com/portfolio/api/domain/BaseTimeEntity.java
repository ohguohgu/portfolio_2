package com.portfolio.api.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    
    // entity 생성되어 저장될 때 시간 자동 저장
    @CreatedDate
    private LocalDateTime createDate;
    
    // 조회한 Entity 값 변경시 시간 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;
    
}
