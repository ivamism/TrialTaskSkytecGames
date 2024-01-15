package by.ivam.skyteckgames.model;

public class User {
   private long id;
   private String name;
   private long clanId;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(long id, String name, long clanId) {
        this.id = id;
        this.name = name;
        this.clanId = clanId;
    }

    public User() {
    }


    public long getClanId() {
        return clanId;
    }

    public void setClanId(long clanId) {
        this.clanId = clanId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clanId=" + clanId +
                '}';
    }
}
