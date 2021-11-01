package ru.netology.domain;


import java.util.Date;

public class CommentsInfo {
    private int userId;
    private Date date;
    private String text;
    private int commentsCount;
    private boolean canPost;

    public int getUserId(){
        return userId;
    }
    public Date getDate(){
        return date;
    }
    public String getText(){
        return text;
    }
    public int getCommentsCount(){
        return commentsCount;
    }
    public boolean getCanPost(){
        return canPost;
    }
    public void setUserId(int userId){
        if (userId>0){
            this.userId = userId;
        }
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setText(String text){
        this.text = text;
    }
    public void setCommentsCount(int commentsCount){
        if (commentsCount > 0) {
            this.commentsCount = commentsCount;
        }
    }
    public void setCanPost(boolean canPost){
        this.canPost = canPost;
    }







}
