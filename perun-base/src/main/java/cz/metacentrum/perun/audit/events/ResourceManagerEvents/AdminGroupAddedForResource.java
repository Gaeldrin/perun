package cz.metacentrum.perun.audit.events.ResourceManagerEvents;

import cz.metacentrum.perun.core.api.Group;
import cz.metacentrum.perun.core.api.Resource;

public class AdminGroupAddedForResource {

    private Group group;
    private Resource resource;
    private String name = this.getClass().getName();
    private String message;

    public String getMessage() {
        return toString();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AdminGroupAddedForResource() {
    }

    public AdminGroupAddedForResource(Group group, Resource resource) {
        this.group = group;
        this.resource = resource;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group " + group + " was added as admin of " + resource + ".";
    }
}