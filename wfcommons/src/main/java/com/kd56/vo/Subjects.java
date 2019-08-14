package com.kd56.vo;

import java.io.Serializable;

public class Subjects implements Serializable{
  private Integer id;
  private String title;
  private Integer totalvotes;
  private Integer viewtimes;
  private String createdate;

  @Override
  public String toString() {
    return "Subjects{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", totalvotes=" + totalvotes +
            ", viewtimes=" + viewtimes +
            ", createdate='" + createdate + '\'' +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getTotalvotes() {
    return totalvotes;
  }

  public void setTotalvotes(Integer totalvotes) {
    this.totalvotes = totalvotes;
  }

  public Integer getViewtimes() {
    return viewtimes;
  }

  public void setViewtimes(Integer viewtimes) {
    this.viewtimes = viewtimes;
  }

  public String getCreatedate() {
    return createdate;
  }

  public void setCreatedate(String createdate) {
    this.createdate = createdate;
  }
}
