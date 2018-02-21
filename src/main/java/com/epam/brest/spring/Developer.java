package com.epam.brest.spring;

public class Developer {
    String name;
    String skill;
    String workPlace;

    public Developer() {

    }

    public Developer(String name, String skill, String workPlace, boolean likeCoffe) {
        this.name = name;
        this.skill = skill;
        this.workPlace = workPlace;
        this.likeCoffe = likeCoffe;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    boolean likeCoffe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public boolean isLikeCoffe() {
        return likeCoffe;
    }

    public void setLikeCoffe(boolean likeCoffe) {
        this.likeCoffe = likeCoffe;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", likeCoffe=" + likeCoffe +
                '}';
    }
}
