package com.example.project_twitch.entity.response;

public class Game {

private String name;
private String releaseTime;
private String developer;
private String website;
private double price;

    public String getName() {
        return name;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getWebsite() {
        return website;
    }

    public double getPrice() {
        return price;
    }

    public Game(Builder builder) {
        this.name = builder.name;
        this.releaseTime = builder.releaseTime;
        this.developer = builder.developer;
        this.website = builder.website;
        this.price = builder.price;
    }
    public static class Builder {
        private String name;
        private String releaseTime;
        private String developer;
        private String website;
        private double price;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        public Builder setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }
        public Game build(){
            return new Game(this);
        }
    }
}
