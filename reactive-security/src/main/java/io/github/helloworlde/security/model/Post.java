package io.github.helloworlde.security.model;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author HelloWood
 * @date 2019-01-08 15:07
 */

@Document
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {

    @Id
    private String id;

    private String title;

    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    @CreatedBy
    private String author;
}
