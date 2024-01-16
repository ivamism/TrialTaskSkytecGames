package by.ivam.skyteckgames;

import by.ivam.skyteckgames.service.ClansService;

public class Starter {
private static final int CLANS_QUANTITY = 5;
    public static void main(String[] args) {

        ClansService.createClansLot(CLANS_QUANTITY);

    }
}