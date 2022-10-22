package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionPointer extends StObject {
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag]
  
  var pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
}
object InteractionPointer {
  
  inline def apply(
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag],
    pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
  ): InteractionPointer = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionPointer]
  }
  
  extension [Self <: InteractionPointer](x: Self) {
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}
