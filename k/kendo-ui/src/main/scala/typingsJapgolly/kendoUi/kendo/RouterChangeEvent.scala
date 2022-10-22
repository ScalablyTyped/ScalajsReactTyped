package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterChangeEvent
  extends StObject
     with RouterEvent {
  
  var backButtonPressed: Boolean
  
  var params: Any
}
object RouterChangeEvent {
  
  inline def apply(
    backButtonPressed: Boolean,
    isDefaultPrevented: CallbackTo[Boolean],
    params: Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterChangeEvent = {
    val __obj = js.Dynamic.literal(backButtonPressed = backButtonPressed.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterChangeEvent]
  }
  
  extension [Self <: RouterChangeEvent](x: Self) {
    
    inline def setBackButtonPressed(value: Boolean): Self = StObject.set(x, "backButtonPressed", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
