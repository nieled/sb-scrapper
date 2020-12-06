package net.nieled.sbscrapper.domain;

public class Entry {
    private int orderNo;
    private String title;
    private int comments;
    private int points;

    public Entry(int orderNo, String title, int comments, int points) {
        this.orderNo = orderNo;
        this.title = title;
        this.comments = comments;
        this.points = points;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "orderNo=" + orderNo +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                ", points=" + points +
                '}';
    }
}
