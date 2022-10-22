package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventData extends StObject {
  
  /***
    * Returns whether stopImmediatePropagation was called on this event object.\
    * @method isImmediatePropagationStopped
    * @return {Boolean}
    */
  def isImmediatePropagationStopped(): Boolean
  
  /***
    * Returns whether stopPropagation was called on this event object.
    * @method isPropagationStopped
    * @return {Boolean}
    */
  def isPropagationStopped(): Boolean
  
  /***
    * Prevents the rest of the handlers from being executed.
    * @method stopImmediatePropagation
    */
  def stopImmediatePropagation(): Unit
  
  /***
    * Stops event from propagating up the DOM tree.
    * @method stopPropagation
    */
  def stopPropagation(): Unit
}
object EventData {
  
  inline def apply(
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    stopImmediatePropagation: Callback,
    stopPropagation: Callback
  ): EventData = {
    val __obj = js.Dynamic.literal(isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn)
    __obj.asInstanceOf[EventData]
  }
  
  extension [Self <: EventData](x: Self) {
    
    inline def setIsImmediatePropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImmediatePropagationStopped", value.toJsFn)
    
    inline def setIsPropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPropagationStopped", value.toJsFn)
    
    inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
  }
}
