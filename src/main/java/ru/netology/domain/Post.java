package ru.netology.domain;

import java.awt.*;
import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private Date publishDate;
    private String text;
    private String link;
    private Image image;

    private CommentsInfo commentsInfo;
    private Like like;
    private Repost repost;
    private ViewsInfo viewsInfo;

    public int getId(){
        return id;
    }
    public int getOwnerId(){
        return ownerId;
    }
    public Date getPublishDate(){
        return publishDate;
    }
    public String getText(){
        return text;
    }
    public String getLink(){
        return link;
    }
    public Image getImage(){
        return image;
    }
    public CommentsInfo getCommentsInfo(){
        return commentsInfo;
    }
    public Like getLike(){
        return like;
    }
    public Repost getRepost(){
        return repost;
    }
    public ViewsInfo getViewsInfo(){
        return viewsInfo;
    }
    public void setId(int id){
        if (id>0){
            this.id = id;
        }
    }
    public void setOwnerId(int ownerId){
        if(ownerId>0){
            this.ownerId = ownerId;
        }
    }
    public void setPublishDate(Date publishDate){
        this.publishDate = publishDate;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setLink(String link){
        this.link = link;
    }
    public void setImage(Image image){
        this.image = image;
    }
    public void setCommentsInfo(CommentsInfo commentsInfo){
        this.commentsInfo = commentsInfo;
    }
    public void setLike(Like like){
        this.like = like;
    }
    public void setRepost(Repost repost){
        this.repost = repost;
    }
    public void setViewsInfo(ViewsInfo viewsInfo){
        this.viewsInfo = viewsInfo;
    }




}
