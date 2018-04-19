package cz.metacentrum.perun.audit.events.UserManagerEvents;

import cz.metacentrum.perun.core.api.User;

public class UserUpdated {
    private User user;
    private String name = this.getClass().getName();
    private String message;

    public String getMessage() {
        return toString();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserUpdated() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserUpdated(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return user + " updated.";
    }
}