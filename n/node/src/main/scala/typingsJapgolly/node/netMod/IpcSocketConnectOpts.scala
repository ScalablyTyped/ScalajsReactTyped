package typingsJapgolly.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpcSocketConnectOpts
  extends ConnectOpts
     with SocketConnectOpts {
  var path: String
}

object IpcSocketConnectOpts {
  @scala.inline
  def apply(path: String, onread: OnReadOpts = null): IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcSocketConnectOpts]
  }
}

