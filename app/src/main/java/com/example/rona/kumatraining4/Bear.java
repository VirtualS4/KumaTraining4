package com.example.rona.kumatraining4;

public class Bear{
    int image;
    String name, team;

    public Bear(int image, String name, String team) {
        this.image = image;
        this.name = name;
        this.team = team;
    }

    public int getImage() { return image;
    }

    public String getName() { return name;
    }

    public String getTeam() {
        return team;
    }
}
