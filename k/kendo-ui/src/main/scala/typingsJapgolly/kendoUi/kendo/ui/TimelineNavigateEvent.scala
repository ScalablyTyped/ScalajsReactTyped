package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineNavigateEvent
  extends StObject
     with TimelineEvent {
  
  var action: js.UndefOr[String] = js.undefined
}
object TimelineNavigateEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Timeline): TimelineNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineNavigateEvent]
  }
  
  extension [Self <: TimelineNavigateEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
