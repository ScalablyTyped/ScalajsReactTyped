package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientXDocument extends StObject {
  
  def get_root(): XElement
  
  def set_root(value: XElement): Unit
}
object ClientXDocument {
  
  inline def apply(get_root: CallbackTo[XElement], set_root: XElement => Callback): ClientXDocument = {
    val __obj = js.Dynamic.literal(get_root = get_root.toJsFn, set_root = js.Any.fromFunction1((t0: XElement) => set_root(t0).runNow()))
    __obj.asInstanceOf[ClientXDocument]
  }
  
  extension [Self <: ClientXDocument](x: Self) {
    
    inline def setGet_root(value: CallbackTo[XElement]): Self = StObject.set(x, "get_root", value.toJsFn)
    
    inline def setSet_root(value: XElement => Callback): Self = StObject.set(x, "set_root", js.Any.fromFunction1((t0: XElement) => value(t0).runNow()))
  }
}
