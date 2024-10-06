package ovh.mythmc.social.addons.chatheadfont.placeholders;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.minso.chathead.API.ChatHeadAPI;
import ovh.mythmc.social.api.players.SocialPlayer;
import ovh.mythmc.social.api.text.parsers.SocialPlaceholder;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ChatHeadFontPlaceholder extends SocialPlaceholder {

    private final ChatHeadAPI chatHeadAPI;

    public ChatHeadFontPlaceholder() {
        chatHeadAPI = ChatHeadAPI.getInstance();
    }

    private final Map<UUID, String> cachedHeads = new HashMap<>();

    @Override
    public String identifier() {
        return "chathead";
    }

    @Override
    public String process(SocialPlayer player) {
        if (cachedHeads.containsKey(player.getUuid()))
            return cachedHeads.get(player.getUuid());

        if (player.getPlayer() == null)
            return "";

        String head = chatHeadAPI.getHeadAsString(player.getPlayer());
        Component deserializedHead = LegacyComponentSerializer.legacySection().deserialize(head);
        String serializedHead = MiniMessage.miniMessage().serialize(deserializedHead);

        cachedHeads.put(player.getUuid(), serializedHead);
        return MiniMessage.miniMessage().serialize(deserializedHead);
    }

}
