package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionInteractionPointerPointerType extends StObject {
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[resize]
  
  var pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
}
object InteractionInteractionPointerPointerType {
  
  inline def apply(
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[resize],
    pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
  ): InteractionInteractionPointerPointerType = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionInteractionPointerPointerType]
  }
  
  extension [Self <: InteractionInteractionPointerPointerType](x: Self) {
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[resize]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}
