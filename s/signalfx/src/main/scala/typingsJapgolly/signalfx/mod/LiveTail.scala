package typingsJapgolly.signalfx.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveTail extends StObject {
  
  def close(): Boolean
  
  def stream(callback: StreamCallback): Boolean
}
object LiveTail {
  
  inline def apply(close: CallbackTo[Boolean], stream: StreamCallback => Boolean): LiveTail = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[LiveTail]
  }
  
  extension [Self <: LiveTail](x: Self) {
    
    inline def setClose(value: CallbackTo[Boolean]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setStream(value: StreamCallback => Boolean): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
