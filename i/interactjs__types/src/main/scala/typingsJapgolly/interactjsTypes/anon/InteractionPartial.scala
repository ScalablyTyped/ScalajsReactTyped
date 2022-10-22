package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionPartial extends StObject {
  
  var element: org.scalajs.dom.Element
  
  var interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[gesture]]
}
object InteractionPartial {
  
  inline def apply(
    element: org.scalajs.dom.Element,
    interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[gesture]]
  ): InteractionPartial = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionPartial]
  }
  
  extension [Self <: InteractionPartial](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[gesture]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
