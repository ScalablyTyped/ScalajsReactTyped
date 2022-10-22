package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the event object used for client-side events.
  */
trait ASPxClientEvent[T] extends StObject {
  
  /**
    * Dynamically connects the event with an appropriate event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def AddHandler(handler: T): Unit
  
  /**
    * Dynamically disconnects the event from all the associated event handler functions.
    */
  def ClearHandlers(): Unit
  
  /**
    * For internal use only.
    */
  def FireEvent(source: Any, e: ASPxClientEventArgs): Unit
  
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def RemoveHandler(handler: T): Unit
}
object ASPxClientEvent {
  
  inline def apply[T](
    AddHandler: T => Callback,
    ClearHandlers: Callback,
    FireEvent: (Any, ASPxClientEventArgs) => Callback,
    RemoveHandler: T => Callback
  ): ASPxClientEvent[T] = {
    val __obj = js.Dynamic.literal(AddHandler = js.Any.fromFunction1((t0: T) => AddHandler(t0).runNow()), ClearHandlers = ClearHandlers.toJsFn, FireEvent = js.Any.fromFunction2((t0: Any, t1: ASPxClientEventArgs) => (FireEvent(t0, t1)).runNow()), RemoveHandler = js.Any.fromFunction1((t0: T) => RemoveHandler(t0).runNow()))
    __obj.asInstanceOf[ASPxClientEvent[T]]
  }
  
  extension [Self <: ASPxClientEvent[?], T](x: Self & ASPxClientEvent[T]) {
    
    inline def setAddHandler(value: T => Callback): Self = StObject.set(x, "AddHandler", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setClearHandlers(value: Callback): Self = StObject.set(x, "ClearHandlers", value.toJsFn)
    
    inline def setFireEvent(value: (Any, ASPxClientEventArgs) => Callback): Self = StObject.set(x, "FireEvent", js.Any.fromFunction2((t0: Any, t1: ASPxClientEventArgs) => (value(t0, t1)).runNow()))
    
    inline def setRemoveHandler(value: T => Callback): Self = StObject.set(x, "RemoveHandler", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
