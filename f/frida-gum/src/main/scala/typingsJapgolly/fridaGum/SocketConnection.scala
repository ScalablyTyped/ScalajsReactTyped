package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketConnection
  extends StObject
     with IOStream {
  
  /**
    * Disables the Nagle algorithm if `noDelay` is `true`, otherwise enables it. The Nagle algorithm is enabled
    * by default, so it is only necessary to call this method if you wish to optimize for low delay instead of
    * high throughput.
    */
  def setNoDelay(noDelay: Boolean): js.Promise[Unit]
}
object SocketConnection {
  
  inline def apply(
    close: CallbackTo[js.Promise[Unit]],
    input: InputStream,
    output: OutputStream,
    setNoDelay: Boolean => js.Promise[Unit]
  ): SocketConnection = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], setNoDelay = js.Any.fromFunction1(setNoDelay))
    __obj.asInstanceOf[SocketConnection]
  }
  
  extension [Self <: SocketConnection](x: Self) {
    
    inline def setSetNoDelay(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "setNoDelay", js.Any.fromFunction1(value))
  }
}
