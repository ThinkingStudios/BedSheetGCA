package org.thinkingstudio.bedsheet.gca;

import dev.dubhe.gugle.carpet.GcaExtension;
import net.neoforged.fml.common.Mod;

@Mod(BedSheetGCAEntrypoint.MODID)
public class BedSheetGCAEntrypoint {
    public static final String MODID = "bedsheet_gca";

    public BedSheetGCAEntrypoint() {
        new GcaExtension().onInitialize();
    }
}
