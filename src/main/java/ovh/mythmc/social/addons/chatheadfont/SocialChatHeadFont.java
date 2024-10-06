package ovh.mythmc.social.addons.chatheadfont;

import org.bukkit.plugin.java.JavaPlugin;
import ovh.mythmc.social.addons.chatheadfont.features.ChatHeadFontFeature;
import ovh.mythmc.social.api.features.SocialGestalt;

public final class SocialChatHeadFont extends JavaPlugin {

    private ChatHeadFontFeature chatHeadFontFeature;

    @Override
    public void onEnable() {
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
