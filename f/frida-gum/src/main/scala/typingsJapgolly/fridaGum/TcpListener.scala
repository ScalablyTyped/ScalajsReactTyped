package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpListener
  extends BaseListener
     with SocketListener {
  /**
    * IP port being listened on.
    */
  var port: Double
}

object TcpListener {
  @scala.inline
  def apply(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    port: Double
  ): TcpListener = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[TcpListener]
  }
}

