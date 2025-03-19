package model;

public class LibraryMember {
    private String Id;
    private String name;

    public LibraryMember(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
