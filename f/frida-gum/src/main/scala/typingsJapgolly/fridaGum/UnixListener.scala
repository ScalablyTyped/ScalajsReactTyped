package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixListener
  extends BaseListener
     with SocketListener {
  /**
    * Path being listened on.
    */
  var path: String
}

object UnixListener {
  @scala.inline
  def apply(
    accept: CallbackTo[js.Promise[SocketConnection]],
    close: CallbackTo[js.Promise[Unit]],
    path: String
  ): UnixListener = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[UnixListener]
  }
}

