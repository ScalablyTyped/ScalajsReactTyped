package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementElement extends StObject {
  
  var element: org.scalajs.dom.Element
  
  var interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drop]]
}
object ElementElement {
  
  inline def apply(
    element: org.scalajs.dom.Element,
    interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drop]]
  ): ElementElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementElement]
  }
  
  extension [Self <: ElementElement](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drop]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
