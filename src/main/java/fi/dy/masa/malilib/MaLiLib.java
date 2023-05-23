package fi.dy.masa.malilib;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;

@Mod("malilib")
public class MaLiLib
{
    public static final Logger logger = LogManager.getLogger(MaLiLibReference.MOD_ID);

    public MaLiLib()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new MaLiLibInitHandler());
    }
}
