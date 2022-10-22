package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/core/Interaction.DoAnyPhaseArg> & {  phase :@interactjs/types.@interactjs/core/InteractEvent.EventPhase,   preEnd :boolean | undefined,   skipModifiers :number | undefined,   modifiedCoords :@interactjs/types.@interactjs/core/types.Point | undefined} */
trait PartialDoAnyPhaseArgphase extends StObject {
  
  var event: js.UndefOr[PointerEventType] = js.undefined
  
  var iEvent: js.UndefOr[InteractEvent[ActionName, EventPhase]] = js.undefined
  
  var interaction: js.UndefOr[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]] = js.undefined
  
  var modifiedCoords: js.UndefOr[Point] = js.undefined
  
  var phase: js.UndefOr[EventPhase] & EventPhase
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var skipModifiers: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialDoAnyPhaseArgphase {
  
  inline def apply(phase: js.UndefOr[EventPhase] & EventPhase): PartialDoAnyPhaseArgphase = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDoAnyPhaseArgphase]
  }
  
  extension [Self <: PartialDoAnyPhaseArgphase](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIEvent(value: InteractEvent[ActionName, EventPhase]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setModifiedCoords(value: Point): Self = StObject.set(x, "modifiedCoords", value.asInstanceOf[js.Any])
    
    inline def setModifiedCoordsUndefined: Self = StObject.set(x, "modifiedCoords", js.undefined)
    
    inline def setPhase(value: js.UndefOr[EventPhase] & EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setSkipModifiers(value: Double): Self = StObject.set(x, "skipModifiers", value.asInstanceOf[js.Any])
    
    inline def setSkipModifiersUndefined: Self = StObject.set(x, "skipModifiers", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
