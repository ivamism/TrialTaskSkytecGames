package by.ivam.skyteckgames.model;


import java.util.concurrent.atomic.AtomicInteger;

public class Clan {
    private long id;
    private String name;
    private AtomicInteger gold;

    public Clan(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AtomicInteger getGold() {
        return gold;
    }

    public void setGold(AtomicInteger gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "Clan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gold=" + gold +
                '}';
    }
}
