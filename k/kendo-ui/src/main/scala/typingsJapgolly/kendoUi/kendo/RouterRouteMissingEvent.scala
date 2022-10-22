package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterRouteMissingEvent
  extends StObject
     with RouterEvent {
  
  var params: Any
}
object RouterRouteMissingEvent {
  
  inline def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    params: Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterRouteMissingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterRouteMissingEvent]
  }
  
  extension [Self <: RouterRouteMissingEvent](x: Self) {
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
