package typingsJapgolly.interactjsTypes.actionsDropPluginMod

import typingsJapgolly.interactjsTypes.actionsDragPluginMod.DragEvent
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropSignalArg extends StObject {
  
  var dragEvent: DragEvent
  
  var interaction: Interaction[drag]
}
object DropSignalArg {
  
  inline def apply(dragEvent: DragEvent, interaction: Interaction[drag]): DropSignalArg = {
    val __obj = js.Dynamic.literal(dragEvent = dragEvent.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropSignalArg]
  }
  
  extension [Self <: DropSignalArg](x: Self) {
    
    inline def setDragEvent(value: DragEvent): Self = StObject.set(x, "dragEvent", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Interaction[drag]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
