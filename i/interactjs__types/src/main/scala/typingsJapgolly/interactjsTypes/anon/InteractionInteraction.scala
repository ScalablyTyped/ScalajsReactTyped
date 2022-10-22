package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionInteraction extends StObject {
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drop]
  
  var pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
}
object InteractionInteraction {
  
  inline def apply(
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drop],
    pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
  ): InteractionInteraction = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionInteraction]
  }
  
  extension [Self <: InteractionInteraction](x: Self) {
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drop]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}
