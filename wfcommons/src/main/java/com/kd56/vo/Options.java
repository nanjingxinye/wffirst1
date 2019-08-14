package com.kd56.vo;

import java.io.Serializable;

public class Options implements Serializable{
  private Integer id;
  private String optcontent;
  private Integer vote;
  private Integer sid;

  @Override
  public String toString() {
    return "Options{" +
            "id=" + id +
            ", optcontent='" + optcontent + '\'' +
            ", vote=" + vote +
            ", sid=" + sid +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getOptcontent() {
    return optcontent;
  }

  public void setOptcontent(String optcontent) {
    this.optcontent = optcontent;
  }

  public Integer getVote() {
    return vote;
  }

  public void setVote(Integer vote) {
    this.vote = vote;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }
}
