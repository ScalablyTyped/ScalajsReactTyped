package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.pointerEventsBaseMod.EventTargetList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget extends StObject {
  
  var event: PointerEventType | org.scalajs.dom.PointerEvent
  
  var eventTarget: org.scalajs.dom.Node
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[Null]
  
  var pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType | org.scalajs.dom.PointerEvent
  
  var pointerEvent: org.scalajs.dom.PointerEvent
  
  var targets: js.UndefOr[EventTargetList] = js.undefined
  
  var `type`: String
}
object EventTarget {
  
  inline def apply(
    event: PointerEventType | org.scalajs.dom.PointerEvent,
    eventTarget: org.scalajs.dom.Node,
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[Null],
    pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType | org.scalajs.dom.PointerEvent,
    pointerEvent: org.scalajs.dom.PointerEvent,
    `type`: String
  ): EventTarget = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  
  extension [Self <: EventTarget](x: Self) {
    
    inline def setEvent(value: PointerEventType | org.scalajs.dom.PointerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: org.scalajs.dom.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[Null]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType | org.scalajs.dom.PointerEvent): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerEvent(value: org.scalajs.dom.PointerEvent): Self = StObject.set(x, "pointerEvent", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: EventTargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Eventable*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
