package ovh.mythmc.social.addons.chatheadfont;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ovh.mythmc.social.addons.chatheadfont.features.ChatHeadFontFeature;
import ovh.mythmc.social.api.features.SocialGestalt;

public final class SocialChatHeadFont extends JavaPlugin {

    private ChatHeadFontFeature chatHeadFontFeature;

    @Override
    public void onEnable() {
        if (!Bukkit.getServer().getOnlineMode()) {
            getLogger().warning("Plugin cannot run if online-mode is set to false!");
            return;
        }

        chatHeadFontFeature = new ChatHeadFontFeature();

        SocialGestalt.get().registerFeature(chatHeadFontFeature);
        SocialGestalt.get().enableFeature(chatHeadFontFeature);
    }

    @Override
    public void onDisable() {
        // Todo: disable
        SocialGestalt.get().unregisterFeature(chatHeadFontFeature);
    }

}
