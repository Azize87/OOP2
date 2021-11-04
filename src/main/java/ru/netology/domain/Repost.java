package ru.netology.domain;

import java.util.Date;

public class Repost {
    private int userId;
    private Date repostDate;
    private int repostCount;
    private int userReposted;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        if (userId > 0) {
            this.userId = userId;
        }
    }

    public Date getRepostDate() {
        return repostDate;
    }

    public void setRepostDate(Date repostDate) {
        this.repostDate = repostDate;
    }

    public int getRepostCount() {
        return repostCount;
    }

    public void setRepostCount(int repostCount) {
        if (repostCount > 0) {
            this.repostCount = repostCount;
        }
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

}
