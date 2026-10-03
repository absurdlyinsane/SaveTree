package Entities;

import java.time.Instant;

public record Save(String index, String comment, Instant lastModified){
    public Save{
        if(index == null || index.isBlank()){
            throw new IllegalArgumentException("Index required");
        }
        if(lastModified == null){
            throw new NullPointerException("lastModified cannot be null");
        }
        if(comment != null && comment.length() > 128){
            throw new IllegalArgumentException("Comment exceeds maximum length of 128 characters");
        }
        comment = (comment != null) ? comment.strip() : null;
    }

    public Save(String index, Instant lastModified) {
        this(index, null, lastModified);
    }

    public String getIndex(){ return index; }
}