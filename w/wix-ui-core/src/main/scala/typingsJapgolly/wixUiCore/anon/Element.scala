package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: Any
  
  var eventTrigger: Any
}
object Element {
  
  inline def apply(element: Any, eventTrigger: Any): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEventTrigger(value: Any): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
  }
}
