package dev.dubhe.gugle.carpet;

import carpet.api.settings.CarpetRule;
import carpet.api.settings.Rule;
import carpet.api.settings.Validator;
import net.minecraft.commands.CommandSourceStack;
import org.jetbrains.annotations.Nullable;
import org.thinkingstudio.bedsheet.loader.FoxifiedLoader;

import java.util.List;

public class GcaValidators {
    public static final boolean CARPET_AMS_ADDITION = FoxifiedLoader.isModLoaded("carpet-ams-addition");

    public static class EnderChest extends Validator<String> {
        public static final List<String> OPTIONS = List.of("true", "false", "ender_chest");

        @Override
        public String validate(@Nullable CommandSourceStack commandSourceStack, CarpetRule<String> carpetRule, String newValue, String userString) {
            return !OPTIONS.contains(newValue) ? null : newValue;
        }

        public String description() {
            return "Can be limited to 'ender_chest' for use EnderChest open only, true/false for open directly/unable";
        }
    }

    public static class CarpetAmsAdditionLoaded implements Rule.Condition {
        @Override
        public boolean shouldRegister() {
            return !CARPET_AMS_ADDITION;
        }
    }
}
