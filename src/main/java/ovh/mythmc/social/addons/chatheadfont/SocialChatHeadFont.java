package ovh.mythmc.social.addons.chatheadfont;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ovh.mythmc.social.addons.chatheadfont.listeners.SocialBootstrapListener;
import ovh.mythmc.social.addons.chatheadfont.placeholders.ChatHeadFontPlaceholder;
import ovh.mythmc.social.api.Social;

public final class SocialChatHeadFont extends JavaPlugin {

    private ChatHeadFontPlaceholder chatHeadFontPlaceholder;

    @Override
    public void onEnable() {
        this.chatHeadFontPlaceholder = new ChatHeadFontPlaceholder();
        register();

        Bukkit.getPluginManager().registerEvents(new SocialBootstrapListener(this), this);
    }

    @Override
    public void onDisable() {
        unregister();
    }

    public void register() {
        Social.get().getTextProcessor().registerParser(chatHeadFontPlaceholder);
    }

    public void unregister() {
        Social.get().getTextProcessor().unregisterParser(chatHeadFontPlaceholder);
    }

}
