package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementEventTrigger extends StObject {
  
  var element: js.UndefOr[org.scalajs.dom.Element] = js.undefined
  
  var eventTrigger: TypeofSimulate
}
object ElementEventTrigger {
  
  inline def apply(eventTrigger: TypeofSimulate): ElementEventTrigger = {
    val __obj = js.Dynamic.literal(eventTrigger = eventTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementEventTrigger]
  }
  
  extension [Self <: ElementEventTrigger](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
  }
}
