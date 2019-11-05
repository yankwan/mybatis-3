package org.apache.ibatis.example.demo.entity;

public class Blog {
  int id;
  String title;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "id: " + getId() + "\n" +
            "title: " + getTitle() + "\n";
  }
}
