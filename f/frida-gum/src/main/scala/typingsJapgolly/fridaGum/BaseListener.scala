package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListener extends js.Object {
  /**
    * Waits for the next client to connect.
    */
  def accept(): js.Promise[SocketConnection]
  /**
    * Closes the listener, releasing resources related to it. Once the listener is closed, all other operations
    * will fail. Closing a listener multiple times is allowed and will not result in an error.
    */
  def close(): js.Promise[Unit]
}

object BaseListener {
  @scala.inline
  def apply(accept: CallbackTo[js.Promise[SocketConnection]], close: CallbackTo[js.Promise[Unit]]): BaseListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[BaseListener]
  }
}

