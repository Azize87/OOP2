package ru.netology.domain;

public class ViewsInfo {
    private int viewsCount;

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        if (viewsCount > 0) {
            this.viewsCount = viewsCount;
        }
    }
}
