package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@interactjs/types.@interactjs/core/Interaction.DoAnyPhaseArg, 'iEvent'> */
trait OmitDoAnyPhaseArgiEvent extends StObject {
  
  var event: PointerEventType
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]
  
  var phase: EventPhase
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OmitDoAnyPhaseArgiEvent {
  
  inline def apply(
    event: PointerEventType,
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName],
    phase: EventPhase
  ): OmitDoAnyPhaseArgiEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDoAnyPhaseArgiEvent]
  }
  
  extension [Self <: OmitDoAnyPhaseArgiEvent](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
