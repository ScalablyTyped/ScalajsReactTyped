package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandler[T] extends StObject {
  
  def subscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[Any]
  
  def unsubscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, Unit]): EventHandler[Any]
  
  def unsubscribeAll(): EventHandler[Any]
}
object EventHandler {
  
  inline def apply[T](
    subscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any],
    unsubscribe: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any],
    unsubscribeAll: CallbackTo[EventHandler[Any]]
  ): EventHandler[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeAll = unsubscribeAll.toJsFn)
    __obj.asInstanceOf[EventHandler[T]]
  }
  
  extension [Self <: EventHandler[?], T](x: Self & EventHandler[T]) {
    
    inline def setSubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any]): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
    
    inline def setUnsubscribe(value: (Event[T], js.Function2[/* e */ EventData, /* data */ T, Unit]) => EventHandler[Any]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    
    inline def setUnsubscribeAll(value: CallbackTo[EventHandler[Any]]): Self = StObject.set(x, "unsubscribeAll", value.toJsFn)
  }
}
