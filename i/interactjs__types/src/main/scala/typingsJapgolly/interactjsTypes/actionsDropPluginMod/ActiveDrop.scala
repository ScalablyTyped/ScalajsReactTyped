package typingsJapgolly.interactjsTypes.actionsDropPluginMod

import typingsJapgolly.interactjsTypes.anon.InteractableActions
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import typingsJapgolly.interactjsTypes.coreTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDrop extends StObject {
  
  var dropzone: InteractableActions
  
  var element: Element
  
  var rect: Rect
}
object ActiveDrop {
  
  inline def apply(dropzone: InteractableActions, element: Element, rect: Rect): ActiveDrop = {
    val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDrop]
  }
  
  extension [Self <: ActiveDrop](x: Self) {
    
    inline def setDropzone(value: InteractableActions): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
