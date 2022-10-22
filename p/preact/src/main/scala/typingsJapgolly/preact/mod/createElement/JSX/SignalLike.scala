package typingsJapgolly.preact.mod.createElement.JSX

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalLike[T] extends StObject {
  
  def peek(): T
  
  def subscribe(fn: js.Function1[/* value */ T, Unit]): js.Function0[Unit]
  
  var value: T
}
object SignalLike {
  
  inline def apply[T](peek: CallbackTo[T], subscribe: js.Function1[/* value */ T, Unit] => js.Function0[Unit], value: T): SignalLike[T] = {
    val __obj = js.Dynamic.literal(peek = peek.toJsFn, subscribe = js.Any.fromFunction1(subscribe), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalLike[T]]
  }
  
  extension [Self <: SignalLike[?], T](x: Self & SignalLike[T]) {
    
    inline def setPeek(value: CallbackTo[T]): Self = StObject.set(x, "peek", value.toJsFn)
    
    inline def setSubscribe(value: js.Function1[/* value */ T, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
