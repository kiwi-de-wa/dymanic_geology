package cs.dynamic_geology;

import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {
	
	@SubscribeEvent
	public void sendMessage(BreakEvent event)
	{
		System.out.println("broken");
	}
}
