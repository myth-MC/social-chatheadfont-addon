package ovh.mythmc.social.addons.chatheadfont.features;

import ovh.mythmc.social.addons.chatheadfont.placeholders.ChatHeadFontPlaceholder;
import ovh.mythmc.social.api.Social;
import ovh.mythmc.social.api.features.SocialFeature;
import ovh.mythmc.social.api.features.SocialFeatureType;

public final class ChatHeadFontFeature implements SocialFeature {

    private final ChatHeadFontPlaceholder placeholder;

    public ChatHeadFontFeature() {
        placeholder = new ChatHeadFontPlaceholder();
    }

    @Override
    public SocialFeatureType featureType() {
        return SocialFeatureType.ADDON;
    }

    @Override
    public boolean canBeEnabled() {
        return true;
    }

    @Override
    public void enable() {
        Social.get().getTextProcessor().registerParser(placeholder);
    }

    @Override
    public void disable() {
        Social.get().getTextProcessor().unregisterParser(placeholder);
    }

}
