package typingsJapgolly.xstate.libTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseActorRef[TEvent /* <: EventObject */] extends StObject {
  
  def send(event: TEvent): Unit
}
object BaseActorRef {
  
  inline def apply[TEvent /* <: EventObject */](send: TEvent => Callback): BaseActorRef[TEvent] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1((t0: TEvent) => send(t0).runNow()))
    __obj.asInstanceOf[BaseActorRef[TEvent]]
  }
  
  extension [Self <: BaseActorRef[?], TEvent /* <: EventObject */](x: Self & BaseActorRef[TEvent]) {
    
    inline def setSend(value: TEvent => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: TEvent) => value(t0).runNow()))
  }
}
