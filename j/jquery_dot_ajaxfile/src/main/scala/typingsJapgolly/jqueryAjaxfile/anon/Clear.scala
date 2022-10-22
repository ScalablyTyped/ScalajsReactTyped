package typingsJapgolly.jqueryAjaxfile.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  def clear(node: org.scalajs.dom.Element): Boolean
  
  def get(node: org.scalajs.dom.Element, key: String): Any
  
  def getAll(node: org.scalajs.dom.Element, createIfNotFound: Boolean): Any
  
  def set(node: org.scalajs.dom.Element, key: String, value: Any): Unit
}
object Clear {
  
  inline def apply(
    clear: org.scalajs.dom.Element => Boolean,
    get: (org.scalajs.dom.Element, String) => Any,
    getAll: (org.scalajs.dom.Element, Boolean) => Any,
    set: (org.scalajs.dom.Element, String, Any) => Callback
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3((t0: org.scalajs.dom.Element, t1: String, t2: Any) => (set(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Clear]
  }
  
  extension [Self <: Clear](x: Self) {
    
    inline def setClear(value: org.scalajs.dom.Element => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setGet(value: (org.scalajs.dom.Element, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetAll(value: (org.scalajs.dom.Element, Boolean) => Any): Self = StObject.set(x, "getAll", js.Any.fromFunction2(value))
    
    inline def setSet(value: (org.scalajs.dom.Element, String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: org.scalajs.dom.Element, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
