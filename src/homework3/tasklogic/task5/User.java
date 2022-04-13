package homework3.tasklogic.task5;

import homework3.classes.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User extends Student {

    private List<String> friends;

    public User() {
        friends = new ArrayList<>(TaskFiveLogic.generateList());
        friends.remove(getName());
    }

    public User(String name) {
        setName(name);
        friends = new ArrayList<>(TaskFiveLogic.generateList());
        friends.remove(getName());
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), friends);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + getId() + "'\t" +
                " name=' " + getName() + "'\t" +
                " surname=' " + getSurname() + "'\t" +
                " friends=" + friends +
                '}';
    }
}
