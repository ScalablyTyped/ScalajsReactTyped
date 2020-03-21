package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener created by `Socket.listen()`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.TcpListener
  - typingsJapgolly.fridaGum.UnixListener
*/
trait SocketListener extends js.Object

object SocketListener {
  @scala.inline
  def TcpListener(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    port: Double
  ): SocketListener = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[SocketListener]
  }
  @scala.inline
  def UnixListener(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    path: String
  ): SocketListener = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[SocketListener]
  }
}

