package typingsJapgolly.bootstrapNotify

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyReturn extends StObject {
  
  @JSName("$ele")
  var $ele: JQuery[HTMLElement]
  
  def close(): Unit
  
  def update(command: String, update: Any): Unit
}
object NotifyReturn {
  
  inline def apply($ele: JQuery[HTMLElement], close: Callback, update: (String, Any) => Callback): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele.asInstanceOf[js.Any], close = close.toJsFn, update = js.Any.fromFunction2((t0: String, t1: Any) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[NotifyReturn]
  }
  
  extension [Self <: NotifyReturn](x: Self) {
    
    inline def set$ele(value: JQuery[HTMLElement]): Self = StObject.set(x, "$ele", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setUpdate(value: (String, Any) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
