package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementElementInteractionPartial extends StObject {
  
  var element: org.scalajs.dom.Element
  
  var interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[resize]]
}
object ElementElementInteractionPartial {
  
  inline def apply(
    element: org.scalajs.dom.Element,
    interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[resize]]
  ): ElementElementInteractionPartial = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementElementInteractionPartial]
  }
  
  extension [Self <: ElementElementInteractionPartial](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[resize]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
