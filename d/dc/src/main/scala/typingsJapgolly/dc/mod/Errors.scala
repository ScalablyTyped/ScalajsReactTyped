package typingsJapgolly.dc.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  def BadArgumentException(): Unit
  
  def Exception(msg: String): Unit
  
  def InvalidStateException(): Unit
}
object Errors {
  
  inline def apply(BadArgumentException: Callback, Exception: String => Callback, InvalidStateException: Callback): Errors = {
    val __obj = js.Dynamic.literal(BadArgumentException = BadArgumentException.toJsFn, Exception = js.Any.fromFunction1((t0: String) => Exception(t0).runNow()), InvalidStateException = InvalidStateException.toJsFn)
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setBadArgumentException(value: Callback): Self = StObject.set(x, "BadArgumentException", value.toJsFn)
    
    inline def setException(value: String => Callback): Self = StObject.set(x, "Exception", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInvalidStateException(value: Callback): Self = StObject.set(x, "InvalidStateException", value.toJsFn)
  }
}
