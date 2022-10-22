package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener created by `Socket.listen()`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.TcpListener
  - typingsJapgolly.fridaGum.UnixListener
*/
trait SocketListener extends StObject
object SocketListener {
  
  inline def TcpListener(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    port: Double
  ): typingsJapgolly.fridaGum.TcpListener = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, close = close.toJsFn, port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.TcpListener]
  }
  
  inline def UnixListener(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    path: String
  ): typingsJapgolly.fridaGum.UnixListener = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, close = close.toJsFn, path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.UnixListener]
  }
}
