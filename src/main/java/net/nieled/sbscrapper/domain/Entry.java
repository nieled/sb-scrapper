package net.nieled.sbscrapper.domain;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return orderNo == entry.orderNo &&
                comments == entry.comments &&
                points == entry.points &&
                Objects.equals(title, entry.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNo, title, comments, points);
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
