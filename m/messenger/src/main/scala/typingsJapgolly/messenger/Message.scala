package typingsJapgolly.messenger

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): Unit
  
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): Unit
  
  /**
    * Show the message, if it's hidden.
    */
  def show(): Unit
  
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): Unit
}
object Message {
  
  inline def apply(cancel: Callback, hide: Callback, show: Callback, update: MessageOptions => Callback): Message = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, hide = hide.toJsFn, show = show.toJsFn, update = js.Any.fromFunction1((t0: MessageOptions) => update(t0).runNow()))
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setUpdate(value: MessageOptions => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: MessageOptions) => value(t0).runNow()))
  }
}
