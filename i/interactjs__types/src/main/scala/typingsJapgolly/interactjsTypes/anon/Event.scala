package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.blur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: org.scalajs.dom.Event
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]
  
  var `type`: blur
}
object Event {
  
  inline def apply(
    event: org.scalajs.dom.Event,
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]
  ): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blur")
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: org.scalajs.dom.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setType(value: blur): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
