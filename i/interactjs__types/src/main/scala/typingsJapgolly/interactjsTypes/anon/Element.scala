package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var dropzone: InteractableAllowFrom
  
  var element: typingsJapgolly.interactjsTypes.coreTypesMod.Element
}
object Element {
  
  inline def apply(dropzone: InteractableAllowFrom, element: typingsJapgolly.interactjsTypes.coreTypesMod.Element): Element = {
    val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setDropzone(value: InteractableAllowFrom): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
