package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.corePointerInfoMod.PointerInfo
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/core/Interaction.PointerArgProps<{  type :'move',   dx :number,   dy :number,   duplicate :boolean}> */
trait PointerArgPropstypemovedx extends StObject {
  
  var duplicate: Boolean
  
  var dx: Double
  
  var dy: Double
  
  var event: PointerEventType
  
  var eventTarget: org.scalajs.dom.Node
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]
  
  var pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
  
  var pointerIndex: Double
  
  var pointerInfo: PointerInfo
  
  var `type`: move
}
object PointerArgPropstypemovedx {
  
  inline def apply(
    duplicate: Boolean,
    dx: Double,
    dy: Double,
    event: PointerEventType,
    eventTarget: org.scalajs.dom.Node,
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing],
    pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType,
    pointerIndex: Double,
    pointerInfo: PointerInfo
  ): PointerArgPropstypemovedx = {
    val __obj = js.Dynamic.literal(duplicate = duplicate.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerIndex = pointerIndex.asInstanceOf[js.Any], pointerInfo = pointerInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("move")
    __obj.asInstanceOf[PointerArgPropstypemovedx]
  }
  
  extension [Self <: PointerArgPropstypemovedx](x: Self) {
    
    inline def setDuplicate(value: Boolean): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: org.scalajs.dom.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerIndex(value: Double): Self = StObject.set(x, "pointerIndex", value.asInstanceOf[js.Any])
    
    inline def setPointerInfo(value: PointerInfo): Self = StObject.set(x, "pointerInfo", value.asInstanceOf[js.Any])
    
    inline def setType(value: move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
