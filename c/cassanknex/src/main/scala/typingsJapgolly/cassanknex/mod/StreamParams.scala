package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamParams extends StObject {
  
  def end(): Any
  
  def error(err: js.Error): Any
  
  def readable(): Any
}
object StreamParams {
  
  inline def apply(end: CallbackTo[Any], error: js.Error => Any, readable: CallbackTo[Any]): StreamParams = {
    val __obj = js.Dynamic.literal(end = end.toJsFn, error = js.Any.fromFunction1(error), readable = readable.toJsFn)
    __obj.asInstanceOf[StreamParams]
  }
  
  extension [Self <: StreamParams](x: Self) {
    
    inline def setEnd(value: CallbackTo[Any]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setError(value: js.Error => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setReadable(value: CallbackTo[Any]): Self = StObject.set(x, "readable", value.toJsFn)
  }
}
