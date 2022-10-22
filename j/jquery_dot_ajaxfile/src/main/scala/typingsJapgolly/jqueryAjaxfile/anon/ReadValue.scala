package typingsJapgolly.jqueryAjaxfile.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadValue extends StObject {
  
  def readValue(element: HTMLElement): Any
  
  def writeValue(element: HTMLElement, value: Any): Unit
}
object ReadValue {
  
  inline def apply(readValue: HTMLElement => Any, writeValue: (HTMLElement, Any) => Callback): ReadValue = {
    val __obj = js.Dynamic.literal(readValue = js.Any.fromFunction1(readValue), writeValue = js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (writeValue(t0, t1)).runNow()))
    __obj.asInstanceOf[ReadValue]
  }
  
  extension [Self <: ReadValue](x: Self) {
    
    inline def setReadValue(value: HTMLElement => Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
    
    inline def setWriteValue(value: (HTMLElement, Any) => Callback): Self = StObject.set(x, "writeValue", js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (value(t0, t1)).runNow()))
  }
}
