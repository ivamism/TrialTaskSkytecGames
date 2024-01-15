package by.ivam.skyteckgames;

import by.ivam.skyteckgames.model.Clan;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Log4j2
public class ClansCreator {
    private static final String CLAN_NAME_TEMPLATE = "Clan_%d";
    private static final String LOG_TEMPLATE = "Created clan - id: %d, name: %s";
    private static ConcurrentMap<Long, Clan> clansLot = new ConcurrentHashMap<>();

    private static Clan createClan(int clanId) {
        Clan clan = new Clan(clanId, String.format(CLAN_NAME_TEMPLATE, clanId));
        log.debug(LOG_TEMPLATE.formatted(clanId, clan.getName()));
        return clan;
    }

    public static void createClansLot(int lotQuantity) {
        clansLot = IntStream.range(0, lotQuantity)
                .mapToObj(i -> createClan(i))
                .collect(Collectors.toConcurrentMap(clan -> clan.getId(), clan -> clan));
        log.debug("Clans lot created. Contains %d clans".formatted(clansLot.size()));
    }
}
