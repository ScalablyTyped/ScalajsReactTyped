package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpListener
  extends StObject
     with BaseListener
     with SocketListener {
  
  /**
    * IP port being listened on.
    */
  var port: Double
}
object TcpListener {
  
  inline def apply(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    port: Double
  ): TcpListener = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, close = close.toJsFn, port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpListener]
  }
  
  extension [Self <: TcpListener](x: Self) {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
