package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerPointerType extends StObject {
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[gesture]
  
  var pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
}
object PointerPointerType {
  
  inline def apply(
    interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[gesture],
    pointer: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
  ): PointerPointerType = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPointerType]
  }
  
  extension [Self <: PointerPointerType](x: Self) {
    
    inline def setInteraction(value: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[gesture]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typingsJapgolly.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}
