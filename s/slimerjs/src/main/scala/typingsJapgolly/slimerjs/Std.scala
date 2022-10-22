package typingsJapgolly.slimerjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Std extends StObject {
  
  def read(): Any
  
  def write(arg: Any): Unit
}
object Std {
  
  inline def apply(read: CallbackTo[Any], write: Any => Callback): Std = {
    val __obj = js.Dynamic.literal(read = read.toJsFn, write = js.Any.fromFunction1((t0: Any) => write(t0).runNow()))
    __obj.asInstanceOf[Std]
  }
  
  extension [Self <: Std](x: Self) {
    
    inline def setRead(value: CallbackTo[Any]): Self = StObject.set(x, "read", value.toJsFn)
    
    inline def setWrite(value: Any => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
