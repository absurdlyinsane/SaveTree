package Entities;

import java.time.Instant;

public record Save(int index, String comment, Instant lastModified){
    public Save{
        if(index < 0){
            throw new IllegalArgumentException("Index cannot be negative: " + index);
        }
        if(lastModified == null){
            throw new NullPointerException("lastModified cannot be null");
        }
        if(comment != null && comment.length() > 128){
            throw new IllegalArgumentException("Comment exceeds maximum length of 128 characters");
        }
        comment = (comment != null) ? comment.strip() : null;
    }

    public Save(int index, Instant lastModified) {
        this(index, null, lastModified);
    }
}