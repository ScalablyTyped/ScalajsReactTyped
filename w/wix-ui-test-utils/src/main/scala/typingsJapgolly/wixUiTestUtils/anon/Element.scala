package typingsJapgolly.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var dataHook: String
  
  var element: js.UndefOr[org.scalajs.dom.Element] = js.undefined
  
  var eventTrigger: TypeofSimulate
  
  var wrapper: org.scalajs.dom.Element
}
object Element {
  
  inline def apply(dataHook: String, eventTrigger: TypeofSimulate, wrapper: org.scalajs.dom.Element): Element = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: org.scalajs.dom.Element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
