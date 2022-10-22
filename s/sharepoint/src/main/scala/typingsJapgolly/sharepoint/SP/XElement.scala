package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XElement extends StObject {
  
  def get_attributes(): Any
  
  def get_children(): Any
  
  def get_name(): String
  
  def set_attributes(value: Any): Unit
  
  def set_children(value: Any): Unit
  
  def set_name(value: String): Unit
}
object XElement {
  
  inline def apply(
    get_attributes: CallbackTo[Any],
    get_children: CallbackTo[Any],
    get_name: CallbackTo[String],
    set_attributes: Any => Callback,
    set_children: Any => Callback,
    set_name: String => Callback
  ): XElement = {
    val __obj = js.Dynamic.literal(get_attributes = get_attributes.toJsFn, get_children = get_children.toJsFn, get_name = get_name.toJsFn, set_attributes = js.Any.fromFunction1((t0: Any) => set_attributes(t0).runNow()), set_children = js.Any.fromFunction1((t0: Any) => set_children(t0).runNow()), set_name = js.Any.fromFunction1((t0: String) => set_name(t0).runNow()))
    __obj.asInstanceOf[XElement]
  }
  
  extension [Self <: XElement](x: Self) {
    
    inline def setGet_attributes(value: CallbackTo[Any]): Self = StObject.set(x, "get_attributes", value.toJsFn)
    
    inline def setGet_children(value: CallbackTo[Any]): Self = StObject.set(x, "get_children", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setSet_attributes(value: Any => Callback): Self = StObject.set(x, "set_attributes", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_children(value: Any => Callback): Self = StObject.set(x, "set_children", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_name(value: String => Callback): Self = StObject.set(x, "set_name", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
