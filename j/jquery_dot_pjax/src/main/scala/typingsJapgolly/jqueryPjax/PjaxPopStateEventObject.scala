package typingsJapgolly.jqueryPjax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for pjax:popstate event.
  */
trait PjaxPopStateEventObject
  extends StObject
     with Event {
  
  /**
    * Navigation direction. Could be "back" or "forward".
    */
  var direction: String
}
object PjaxPopStateEventObject {
  
  inline def apply(
    direction: String,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    timeStamp: Double,
    `type`: String
  ): PjaxPopStateEventObject = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PjaxPopStateEventObject]
  }
  
  extension [Self <: PjaxPopStateEventObject](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
