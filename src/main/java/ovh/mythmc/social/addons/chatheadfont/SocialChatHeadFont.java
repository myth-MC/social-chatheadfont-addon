package ovh.mythmc.social.addons.chatheadfont;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ovh.mythmc.social.addons.chatheadfont.features.ChatHeadFontFeature;
import ovh.mythmc.social.addons.chatheadfont.listeners.SocialBootstrapListener;
import ovh.mythmc.social.addons.chatheadfont.placeholders.ChatHeadFontPlaceholder;
import ovh.mythmc.social.api.Social;
import ovh.mythmc.social.api.features.SocialGestalt;

public final class SocialChatHeadFont extends JavaPlugin {

    private final ChatHeadFontFeature chatHeadFontFeature = new ChatHeadFontFeature();

    @Override
    public void onEnable() {
        SocialGestalt.get().registerFeature(chatHeadFontFeature);
        SocialGestalt.get().enableFeature(chatHeadFontFeature);
    }

    @Override
    public void onDisable() {
        // Todo: disable
        SocialGestalt.get().unregisterFeature(chatHeadFontFeature);
    }

}
