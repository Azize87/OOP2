package ru.netology.domain;

import java.util.Date;

public class Repost {
    private int userId;
    private Date repostDate;
    private int repostCount;

    public int getUserId(){
        return userId;
    }
    public Date getRepostDate(){
        return repostDate;
    }
    public int getRepostCount(){
        return repostCount;
    }
    public void setUserId(int userId){
        if (userId>0){
            this.userId = userId;
        }
    }
    public void setRepostDate(Date repostDate){
        this.repostDate = repostDate;
    }
    public void setRepostCount(int repostCount){
        if (repostCount>0){
            this.repostCount = repostCount;
        }
    }

}
