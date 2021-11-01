package ru.netology.domain;

public class Like {
    private int likeCount;
    private boolean isUserLiked;
    private boolean canLike;

    public int getLikeCount(){
        return likeCount;
    }
    public boolean getIsUserLiked(){
        return isUserLiked;
    }
    public boolean getCanLike(){
        return canLike;
    }
    public void setLikeCount(int likeCount){
        if (likeCount>0){
            this.likeCount = likeCount;
        }
    }
    public void setIsUserLiked(boolean isUserLiked){
        this.isUserLiked = isUserLiked;
    }
    public void setCanLike(boolean canLike){
        this.canLike = canLike;
    }


}
