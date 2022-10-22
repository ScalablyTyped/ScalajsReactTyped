package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientXElement extends StObject {
  
  def get_element(): XElement
  
  def set_element(value: XElement): Unit
}
object ClientXElement {
  
  inline def apply(get_element: CallbackTo[XElement], set_element: XElement => Callback): ClientXElement = {
    val __obj = js.Dynamic.literal(get_element = get_element.toJsFn, set_element = js.Any.fromFunction1((t0: XElement) => set_element(t0).runNow()))
    __obj.asInstanceOf[ClientXElement]
  }
  
  extension [Self <: ClientXElement](x: Self) {
    
    inline def setGet_element(value: CallbackTo[XElement]): Self = StObject.set(x, "get_element", value.toJsFn)
    
    inline def setSet_element(value: XElement => Callback): Self = StObject.set(x, "set_element", js.Any.fromFunction1((t0: XElement) => value(t0).runNow()))
  }
}
