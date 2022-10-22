package typingsJapgolly.meteor.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  def accept(): Unit
  
  var data: js.Object | Null
  
  def decline(): Unit
  
  def dispose(callback: js.Function1[/* data */ js.Object, Unit]): Unit
  
  def onRequire[T](callbacks: After[T]): Unit
}
object Accept {
  
  inline def apply(
    accept: Callback,
    decline: Callback,
    dispose: js.Function1[/* data */ js.Object, Unit] => Callback,
    onRequire: After[Any] => Callback
  ): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, decline = decline.toJsFn, dispose = js.Any.fromFunction1((t0: js.Function1[/* data */ js.Object, Unit]) => dispose(t0).runNow()), onRequire = js.Any.fromFunction1((t0: After[Any]) => onRequire(t0).runNow()), data = null)
    __obj.asInstanceOf[Accept]
  }
  
  extension [Self <: Accept](x: Self) {
    
    inline def setAccept(value: Callback): Self = StObject.set(x, "accept", value.toJsFn)
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDecline(value: Callback): Self = StObject.set(x, "decline", value.toJsFn)
    
    inline def setDispose(value: js.Function1[/* data */ js.Object, Unit] => Callback): Self = StObject.set(x, "dispose", js.Any.fromFunction1((t0: js.Function1[/* data */ js.Object, Unit]) => value(t0).runNow()))
    
    inline def setOnRequire(value: After[Any] => Callback): Self = StObject.set(x, "onRequire", js.Any.fromFunction1((t0: After[Any]) => value(t0).runNow()))
  }
}
