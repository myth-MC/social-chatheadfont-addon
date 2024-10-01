package ovh.mythmc.social.addons.chatheadfont.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import ovh.mythmc.social.addons.chatheadfont.SocialChatHeadFont;
import ovh.mythmc.social.api.events.SocialBootstrapEvent;

public final class SocialBootstrapListener implements Listener {

    private final SocialChatHeadFont plugin;

    public SocialBootstrapListener(final @NotNull SocialChatHeadFont plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onSocialBootstrap(SocialBootstrapEvent event) {
        plugin.register();
    }

}
