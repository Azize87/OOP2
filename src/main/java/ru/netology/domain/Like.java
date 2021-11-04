package ru.netology.domain;

public class Like {
    private int likeCount;
    private boolean isUserLiked;
    private boolean canLike;
    private int canPublish;

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        if (likeCount > 0) {
            this.likeCount = likeCount;
        }
    }

    public boolean getIsUserLiked() {
        return isUserLiked;
    }

    public void setIsUserLiked(boolean isUserLiked) {
        this.isUserLiked = isUserLiked;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }


}
