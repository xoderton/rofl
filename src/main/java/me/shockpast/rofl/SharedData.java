package me.shockpast.rofl;

import java.util.*;

public class SharedData {
    public final Set<UUID> vanished_players = new HashSet<>();
    public final Map<UUID, Long> muted_players = new HashMap<>();
}
