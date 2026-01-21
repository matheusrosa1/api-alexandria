package com.betrybe.alexandria.entity;

public class Author {

  private Long id;

  private String name;
  private String nationlity;

  public Author() {
  }

  public Author(String name, String nationlity) {
    this.name = name;
    this.nationlity = nationlity;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNationlity() {
    return nationlity;
  }

  public void setNationlity(String nationlity) {
    this.nationlity = nationlity;
  }
}
