package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseFn[I] extends StObject {
  
  def closeFn(): Unit
  
  def sendFn(msg: I): Unit
}
object CloseFn {
  
  inline def apply[I](closeFn: Callback, sendFn: I => Callback): CloseFn[I] = {
    val __obj = js.Dynamic.literal(closeFn = closeFn.toJsFn, sendFn = js.Any.fromFunction1((t0: I) => sendFn(t0).runNow()))
    __obj.asInstanceOf[CloseFn[I]]
  }
  
  extension [Self <: CloseFn[?], I](x: Self & CloseFn[I]) {
    
    inline def setCloseFn(value: Callback): Self = StObject.set(x, "closeFn", value.toJsFn)
    
    inline def setSendFn(value: I => Callback): Self = StObject.set(x, "sendFn", js.Any.fromFunction1((t0: I) => value(t0).runNow()))
  }
}
