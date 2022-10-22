package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCloseEvent
  extends StObject
     with DialogEvent {
  
  var userTriggered: js.UndefOr[Boolean] = js.undefined
}
object DialogCloseEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Dialog): DialogCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCloseEvent]
  }
  
  extension [Self <: DialogCloseEvent](x: Self) {
    
    inline def setUserTriggered(value: Boolean): Self = StObject.set(x, "userTriggered", value.asInstanceOf[js.Any])
    
    inline def setUserTriggeredUndefined: Self = StObject.set(x, "userTriggered", js.undefined)
  }
}
