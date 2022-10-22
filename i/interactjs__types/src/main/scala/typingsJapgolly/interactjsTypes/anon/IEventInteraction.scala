package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventInteraction extends StObject {
  
  var iEvent: InteractEvent[Any, EventPhase]
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[Any]
}
object IEventInteraction {
  
  inline def apply(
    iEvent: InteractEvent[Any, EventPhase],
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[Any]
  ): IEventInteraction = {
    val __obj = js.Dynamic.literal(iEvent = iEvent.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventInteraction]
  }
  
  extension [Self <: IEventInteraction](x: Self) {
    
    inline def setIEvent(value: InteractEvent[Any, EventPhase]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[Any]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
