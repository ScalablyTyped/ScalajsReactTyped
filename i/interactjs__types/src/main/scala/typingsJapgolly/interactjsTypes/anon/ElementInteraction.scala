package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementInteraction extends StObject {
  
  var element: org.scalajs.dom.Element
  
  var interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag]]
}
object ElementInteraction {
  
  inline def apply(
    element: org.scalajs.dom.Element,
    interaction: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag]]
  ): ElementInteraction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementInteraction]
  }
  
  extension [Self <: ElementInteraction](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
