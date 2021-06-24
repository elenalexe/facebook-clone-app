package Friends;

import java.util.Objects;

public class Friend {
    private String name, birthday, lives, from;

    public Friend(String name, String birthday, String lives, String from) {
        this.name = name;
        this.birthday = birthday;
        this.lives = lives;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLives() {
        return lives;
    }

    public void setLives(String lives) {
        this.lives = lives;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend)) return false;
        Friend friend = (Friend) o;
        return getName().equals(friend.getName()) &&
                getBirthday().equals(friend.getBirthday()) &&
                getLives().equals(friend.getLives()) &&
                getFrom().equals(friend.getFrom());
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", lives='" + lives + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
